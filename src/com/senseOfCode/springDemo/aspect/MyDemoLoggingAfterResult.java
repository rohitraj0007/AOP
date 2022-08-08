package com.senseOfCode.springDemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.senseOfCode.springDemo.Coach;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAfterResult {
	
	@AfterReturning(
			pointcut="execution(* com.senseOfCode.springDemo.dao.CoachDao.getCoach())",
			returning = "result")
	public void afterReturningGetCoachAdvice(JoinPoint joinPoint, List<Coach> result) {
		String method= joinPoint.getSignature().getName();
		System.out.println("method is :"+method);
		
	}
	
	@AfterThrowing(
			"execution(* com.senseOfCode.springDemo.dao.CoachDao.getCoachOne())")
	public void afterThrowingGetCoachAdvice(JoinPoint joinPoint) {
		String method= joinPoint.getSignature().getName();
		System.out.println("method is :"+method);
		
	}

}
