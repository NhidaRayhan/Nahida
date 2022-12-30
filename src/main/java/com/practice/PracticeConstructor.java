package com.practice;

public class PracticeConstructor {
	
	//special type of method
	//name must be the same as its class name
	//should not be return type or void type
	int a;//instance variable
	int b;//instance variable
	
	public PracticeConstructor(int x, int y) {//x & y local variable
		
		this.a=x;
		this.b=y;
		
		System.out.println(x);
		System.out.println("This is summation=" +(x+y));
		
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		
		PracticeConstructor obj = new PracticeConstructor(10, 20);
		
		//No need to use an object
		//Constructor automatically creates an object
		
	}
	
}
