package com.app.beans;

import org.springframework.context.annotation.ImportResource;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class Amazon {
	
	
	@Inject
	@Named(value = "delhivery")
	private LogisticsService logisticsService;

	@Override
	public String toString() {
		return "Amazon [logisticsService=" + logisticsService + "]";
	}
	
	

}
