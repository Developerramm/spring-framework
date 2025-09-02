package com.app.beans;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class Amazon {
	
	@Inject
	@Named("delhivery")
	private LogisticsService logisticsService;

	@Override
	public String toString() {
		return "Amazon [logisticsService=" + logisticsService + "]";
	}
	
	

}
