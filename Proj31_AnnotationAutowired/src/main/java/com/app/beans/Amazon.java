package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Amazon {
	
	@Autowired
	private LogisticsService logisticsService;
	
	public void trackOrder(int orderId) {
		logisticsService.trackOrderLocation(orderId);
	}

}
