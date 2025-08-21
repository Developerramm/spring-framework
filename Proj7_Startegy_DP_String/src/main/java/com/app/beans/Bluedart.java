package com.app.beans;

// dependent spring bean
public final class Bluedart implements LogisticsService {

	@Override
	public String checkDeliveryStatus(String orderId) {
		String status = "Your order id " + orderId + " is "
				+ "reached to the nearest hub. It will be deliver by bluedart"
				+ " delivery agent";
		return status;		
	}

	@Override
	public String orderReturnRequest(String orderId) {
		String returnRequestStatus=  " Your order id " + orderId + " a "
				+ " return request is accepted, Bluedart delivery agent will "
				+ " pick your items soon";
		
		return returnRequestStatus;
	}

	@Override
	public String orderReplaceRequest(String orderId) {
		String replaceStatus=  " Your order id " + orderId + " a "
				+ " replace request is accepted, please keep items with invoice ";
		
		return replaceStatus;
	}
	
	

}
