package com.practice;

public class PracticeCheckedException {
	
	
	public void getMethod1() {
		System.out.println("This is method 1.");
	}
	
	public void getPause() throws InterruptedException  {
		
		Thread.sleep(5000);
		
	}
	
	public void getMethod2() {
		System.out.println("This is method 2.");
	}
	
	public static void main(String[] args) {
		
		PracticeCheckedException obj = new PracticeCheckedException();
		
		obj.getMethod1();
		
		obj.getMethod2();
		
	}

}
