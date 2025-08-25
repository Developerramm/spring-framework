package com.app.beans;

import java.util.Set;

public class User {
	
	private Set<Long> phoneNumbers;
	private Set<String> emailIds;
	
	
	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	public Set<String> getEmailIds() {
		return emailIds;
	}
	public void setEmailIds(Set<String> emailIds) {
		this.emailIds = emailIds;
	}
	@Override
	public String toString() {
		return "User [phoneNumbers=" + phoneNumbers + ", emailIds=" + emailIds + "]";
	}
	
	

}
