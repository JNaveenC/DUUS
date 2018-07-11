package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.FlipKart;

public class TestDeliver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		FlipKart bean=factory.getBean("fkt",FlipKart.class);
		String billMsg=bean.purchase(new String[] {"phone","laptop","bike"});
		System.out.println(/*"Your Bill=:"+*/billMsg);
	}
}
