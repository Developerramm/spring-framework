package com.app.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PerformanceMonitoringAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("PerformanceMonitoringAdvice.invoke()");
		
		// pre-logic here
		long startTime = System.currentTimeMillis();
		
		Object returnValue =  invocation.proceed();
		
		// post logic
		long endTime = System.currentTimeMillis();
		
		System.out.println(invocation.getMethod().getName()
				+ " Method had taken " + (endTime - startTime) + " milliseconds"
				);
		
		
		return returnValue;
	}

}
