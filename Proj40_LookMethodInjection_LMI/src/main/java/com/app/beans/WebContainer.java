package com.app.beans;

public abstract class WebContainer {
	
	public abstract RequestHandler getRequestHandler();
	
	public void processRequest(String data) {
		System.out.println("request is getting handle");
		
		RequestHandler requestHandler = null;
		
		requestHandler = getRequestHandler();
		requestHandler.handleRequest(data);
	}

}
