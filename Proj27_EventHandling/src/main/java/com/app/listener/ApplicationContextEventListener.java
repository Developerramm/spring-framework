package com.app.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public  class ApplicationContextEventListener implements ApplicationListener<ApplicationEvent> {

	// event handler method
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("ioc container started..., event occured");
	}

}
