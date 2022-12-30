package com.practice;

public class PracticeOverloading {

	public void getJob() {
		System.out.println("This is the first method");
	}

	public void getJob(int a, int b, int c) {
		System.out.println("This is the second method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public void getJob(int a, String b, int c) {

	}
	
	public void getJob(int a, String b) {

	}
	
	public String getJob(int a, int c, String b) {//change the position of the parameter
		return "Batch-30";
	}
	
}
