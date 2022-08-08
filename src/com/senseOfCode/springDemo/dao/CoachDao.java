package com.senseOfCode.springDemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.senseOfCode.springDemo.Coach;

@Component
public class CoachDao {
	public void addCoach() {
		System.out.println(getClass()+": Doing mydb work:Adding an account");
	}
	
	public void addCoachForUser(String name,String age) {
		System.out.println(getClass()+": adding coach for user");
	}
	public List<Coach> getCoach(){
		List<Coach> list = new ArrayList<>();
		System.out.println("after return");
		return list;
		
	}
	public List<Coach> getCoachOne() throws Exception {
		List<Coach> list = new ArrayList<>();
		System.out.println("after Exception");
		throw new Exception("exception");
		
		
	}

}
