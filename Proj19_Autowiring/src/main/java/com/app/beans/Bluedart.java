package com.app.beans;

public class Bluedart implements LogisticsService{

	@Override
	public void trackOrder(int orderId) {
		System.out.println("Your order id " + orderId + " is reached to "
				+ "the nearest hub. It will delivered by bluedart agent");
		
	}

}
