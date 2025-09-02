package com.app.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class CreditCard {
	
	private String cardNo;

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNo=" + cardNo + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init method in credit card");
		
		if(cardNo == null) {
			throw new IllegalArgumentException("Card no is required");
		}
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method in credit card");
		cardNo = null;
	}

}
