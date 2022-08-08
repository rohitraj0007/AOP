package com.senseOfCode.springDemo;

public class CricketCoach implements Coach {
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	
	public CricketCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "work for 2 hours";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
	// adding init method
	public void startOfBean() {
		System.out.println("starting");
	}
	
	// adding destroy method
		public void endOfBean() {
			System.out.println("destroying");
		}

}
