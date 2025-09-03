package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.BankLoanInterestCalculator;

public class MethodReplacerTest {
	
	public static void main(String[] args) {
		ApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("config.xml");
		
		BankLoanInterestCalculator loan = null;
	
		loan = context.getBean("l1",BankLoanInterestCalculator.class);
		float interest =  loan.calLoanInterest(1000, 2, 2);
		System.out.println(interest);
		
		((AbstractApplicationContext)context).close();
	}

}
