package com.senseOfCode.springDemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAroundAdvice {
	@Around(
			"execution(* com.senseOfCode.springDemo.dao.CoachDao.getCoach())"
			)
	public Object aroundGetCoachAdvice(ProceedingJoinPoint  proceedingJoinPoint) throws Throwable {
		String method= proceedingJoinPoint.getSignature().getName();
		System.out.println("method is :"+method);
		long begin = System.currentTimeMillis();
		Object result = proceedingJoinPoint.proceed();
		long end = System.currentTimeMillis();
		long duration= end- begin;
		System.out.println("duration is:"+ duration);
		return result;	
	}
}
