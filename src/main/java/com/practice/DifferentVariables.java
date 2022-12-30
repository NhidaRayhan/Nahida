package com.practice;

public class DifferentVariables {
	
	int x = 45;//instance variable
	static int y = 35;
	
	public void getMoney() {
		
		int a = 15;//local variable inside getMoney method
		
		System.out.println(a);
		System.out.println(y);
		
	}
	
	public void getSalary() {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		DifferentVariables obj = new DifferentVariables();
		obj.getMoney();
		obj.getSalary();
	}

}
