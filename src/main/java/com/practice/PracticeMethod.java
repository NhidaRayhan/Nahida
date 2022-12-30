package com.practice;

public class PracticeMethod {
	
	public void getVoidMethod() {//non-static void method => need to create an object
		System.out.println("This is non-static void method.");
	}
	
	public static void getStaticVoid() {//static void method => NO need to create an object
		System.out.println("This is static void method.");
	}
	
	public String getReturnMethod() {//non-static return method
		
		System.out.println("This is non-static return method.");
		return "method";
	}
	
	public static int getStaticReturnMethod() {//static return method => NO need to create an object
		
		System.out.println("This is static return method.");
		return 20;
	}
	
	public static void main(String[] args) {
		
		PracticeMethod obj = new PracticeMethod();//ClassName obj = new ClassName();
		obj.getVoidMethod();
		
		getStaticVoid();
		
		obj.getReturnMethod();
		
		getStaticReturnMethod();
		
	}

}
