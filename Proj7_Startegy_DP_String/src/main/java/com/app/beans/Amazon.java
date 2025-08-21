package com.app.beans;


// target spring bean class
public final class Amazon {
	
	private LogisticsService logisticsService;
	
	public Amazon(LogisticsService logisticsService) {
		this.logisticsService = logisticsService;
	}
	
	public String checkDeliveryStatus(String orderId) {
		return logisticsService.checkDeliveryStatus(orderId);
	}
	
	public void returnOrder(String orderId) {
		logisticsService.orderReturnRequest(orderId);
	}

}
