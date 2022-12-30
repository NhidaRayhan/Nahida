package com.practice;

public class PracticeParameter {
	
	public void getMoney(int a, int b) {
		
	
		System.out.println(a+b);
		
		
	}
	
	public void getSalary(String x, String y, String z) {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		
		PracticeParameter obj = new PracticeParameter();
		
		obj.getMoney(10, 20);//a=10, b=20
		
		obj.getMoney(40, 50);//a=40, b=50
		
		obj.getMoney(5, 1);//a=5, b=1
		
		obj.getMoney(0, 0);
		
		obj.getSalary("Batch 30", "Night", "Hello");
		
	}

}
