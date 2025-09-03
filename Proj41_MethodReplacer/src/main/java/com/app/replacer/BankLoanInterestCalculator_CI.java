package com.app.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public  class BankLoanInterestCalculator_CI implements MethodReplacer{

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		
		// logic to calculate compound interest
		
		System.out.println("BankLoanInterestCalculator_CI.reimplement()");
		
		float p = (float)args[0];
		float r = (float)args[1];
		float t = (float)args[2];
		
		float ci = (float)(p*Math.pow((1+r/100), t) - p);
		return ci;
	}

}
