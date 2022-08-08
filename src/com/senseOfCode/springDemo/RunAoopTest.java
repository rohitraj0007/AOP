package com.senseOfCode.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.senseOfCode.springDemo.dao.CoachDao;

public class RunAoopTest {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
	CoachDao coachDao = context.getBean("coachDao",CoachDao.class);
	//coachDao.addCoach();
	coachDao.addCoachForUser("Rohit","32");
	context.close();
}
}
