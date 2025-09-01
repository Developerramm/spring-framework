package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon {
	
	@Autowired
	@Qualifier("bluedart")
	private LogisticsService logisticsService;
	
	public void trackOrder(int orderId) {
		logisticsService.trackOrderLocation(orderId);
	}

}
