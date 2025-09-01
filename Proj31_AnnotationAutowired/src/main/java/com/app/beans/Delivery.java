package com.app.beans;

public class Delivery implements LogisticsService {

	@Override
	public void trackOrderLocation(int orderId) {
		System.out.println("Your order id " + orderId + " is reache to"
				+ " the nearest hub . Deliver by Delivery");

	}

}
