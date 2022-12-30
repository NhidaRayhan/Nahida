package com.practice;

public class Homework2 {
	
	public void getMoney() {//non-static method => need to create an object
		System.out.println("This is non-static void method.");
	}
	
	public static void getSalary() {//static method => no need to create an object
		System.out.println("This is static void method.");
	}
	
	public int getIncome() {//non-static return method => need to create an object
		System.out.println("This is non-static return method.");
		return 20;
	}
	
	public static String getUsername() {//static method => no need to create an object
		System.out.println("This is static return method.");
		return "username";
	}
	
	public static void main(String[] args) {
		//Formula to create an object => ClassName obj = new ClassName();
		
		Homework2 obj = new Homework2();
		
		obj.getMoney();
		
		//getSalary();
		Homework2.getSalary();
		
		obj.getIncome();
		
		getUsername();
		
	}

}
