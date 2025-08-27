package com.app.beans;

public class Delivery implements LogisticsService {

	@Override
	public void trackOrder(int orderId) {
		System.out.println("Your order is " + orderId + " is reached to the nearest "
				+ "hub . it will deliver by delivery agent");

	}

}
