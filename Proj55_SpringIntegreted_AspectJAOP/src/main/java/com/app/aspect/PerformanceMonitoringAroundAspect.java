package com.app.aspect;


import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

public class PerformanceMonitoringAroundAspect{
	
	public <ProceedingJoinPoint> Object monitorPerformance(ProceedingJoinPoint pjp)
			throws Throwable{
		
		// pre-logic
		long startTime = System.currentTimeMillis();
		
		Object returnValue = ((MethodInvocationProceedingJoinPoint) pjp).proceed();
		
		// post logic
		long endtime = System.currentTimeMillis();
		
		System.out.println("Time taken " + (endtime - startTime));
		
		return returnValue;
		
	}

}
