package com.nt.beans;

public class BlueDart implements Courier {

	@Override
	public String Deliver(int Orderid) {
		// TODO Auto-generated method stub
		return "Your order is Sucessfully Delivered with BlueDart=:"+Orderid;
	}
}