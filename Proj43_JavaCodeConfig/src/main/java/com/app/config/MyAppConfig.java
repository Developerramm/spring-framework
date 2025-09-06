package com.app.config;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages = "com.app")
@ImportResource("config.xml")
public class MyAppConfig {
	
	@Bean(name="holidayDate")
	public Date date(){
		return new Date();
	}

}
