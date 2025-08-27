package com.app.beans;

public class Amazon {
	
	private LogisticsService logisticsService;

	public void setLogisticsService(LogisticsService logisticsService) {
		this.logisticsService = logisticsService;
	}
	
	public void trackOrder(int orderId) {
		logisticsService.trackOrder(orderId);
	}

}
