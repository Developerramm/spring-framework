package com.app.beans;

public class BlueDart implements LogisticsService {

	@Override
	public void trackOrderLocation(int orderId) {
		System.out.println("Your order id " + orderId + "is reached to the "
				+ " nearest hub. Delivered by BlueDart");
	}

}
