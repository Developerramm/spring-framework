package com.app.beans;

public class Amazon {
	
	private Delivery delivery;
	
	public Amazon() {
		System.out.println("Amazon.Amazon()");
	}
	
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	
	public void shipOrder(int orderId) {
		System.out.println("order shipped " + orderId);
	}

}
