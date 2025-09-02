package com.app.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AccountHolder implements InitializingBean,DisposableBean{
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AccountHolder [name=" + name + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Ac holder destory method call");
		name = null;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ac init called");
		if(name == null) {
			throw new IllegalArgumentException("name cannot be null");		}
		
	}
	
	

}
