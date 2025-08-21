package com.app.beans;

public final class EcomExpresss  implements LogisticsService{

	@Override
	public String checkDeliveryStatus(String orderId) {
		String status = "Your order id " + orderId + " is "
				+ "reached to the nearest hub. It will be deliver by EcomExpress"
				+ " EcomExpress agent";
		return status;		
	}

	@Override
	public String orderReturnRequest(String orderId) {
		String returnRequestStatus=  " Your order id " + orderId + " a "
				+ " return request is accepted, EcomExpress delivery agent will "
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
