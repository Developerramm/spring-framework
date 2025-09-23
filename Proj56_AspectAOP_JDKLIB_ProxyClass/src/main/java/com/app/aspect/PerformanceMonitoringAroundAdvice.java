package com.app.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformanceMonitoringAroundAdvice {

	public Object monitorPerformance(ProceedingJoinPoint pjp) throws Throwable {
    	
    	System.out.println("PerformanceMonitoringAroundAdvice.monitorPerformance()");
    	
    	System.out.println("prelogic performance monitoring logic");
        long start = System.currentTimeMillis();

        Object result = pjp.proceed(); // Proceed with the original method
        
        System.out.println("post logic performance monitoring logic");
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: " + (end - start) + " ms");
        
        System.out.println(pjp.getSignature());

        return result;
    }
}