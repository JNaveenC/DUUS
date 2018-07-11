package com.nt.beans;

import java.util.Random;

public class FlipKart {
	private	Courier courier; 

	public FlipKart()
	{
		System.out.println("Flip kart O param constructors");
	}
	
	public void setCourier(Courier courier) {
		System.out.println("Set Courier method");
		this.courier = courier;
	}
	public String purchase(String items[])
	{
		Random rd=new Random();
		int Orderid=rd.nextInt(100);
		
		String status=courier.Deliver(Orderid);
		return "Your Order is Sucessfully Delivered with FlipKart  Order Id="+Orderid+"\n"/*+"Bill Amount=1500"*/;
		
	}
}
