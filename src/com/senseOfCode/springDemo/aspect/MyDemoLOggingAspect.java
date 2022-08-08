package com.senseOfCode.springDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyDemoLOggingAspect {
	@Pointcut ("execution(public void addCoach())")
	private void forDaoPackage() {}
	
	@Pointcut ("execution(public * addCoach*())")
	private void forServicePackage() {}

	@Pointcut("execution(public void addCoachFor*(*,*))")
	public void beforeAddAccountAdvice() {}
	
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("\n======>>> executing apiAnalyticsz for DAO");
	}
	//using joinPoint
	@Before("forDaoPackage() || beforeAddAccountAdvice()")
	public void performApiAnalyticsAndAccountService(JoinPoint joinPoint) {
		
		Object[] args =joinPoint.getArgs();
		if(args.length==2) {
			System.out.println("Name of user is:"+args[0] +" and age is : "+args[1]);
		}
		System.out.println("\n======>>> executing apiAnalyticsz for combined");
	}
}
