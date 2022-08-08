package com.senseOfCode.springDemo.dao;

import org.springframework.stereotype.Component;

@Component
public class CoachDao {
	public void addCoach() {
		System.out.println(getClass()+": Doing mydb work:Adding an account");
	}
	
	public void addCoachForUser(String name,String age) {
		System.out.println(getClass()+": adding coach for user");
	}

}
