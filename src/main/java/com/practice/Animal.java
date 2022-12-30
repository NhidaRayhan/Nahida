package com.practice;

public class Animal {

	public  void getSalary() {
		//method body => write the code here
		System.out.println("Get Salary");
	}
	
	public static void getMoney() {
		System.out.println("Get money");
	}
	
	public String myCat() {
		
		System.out.println("This is my cat");
		return "cat";
	}
	

	
	public static void main(String[] args) {

		Animal obj = new Animal();//instantiation
		obj.getSalary();
		//Animal.getMoney();
		getMoney();
		
	}
	
}
