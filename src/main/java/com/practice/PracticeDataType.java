package com.practice;

public class PracticeDataType {
	
	int a;//no assigned value
	double b;//no assigned value
	boolean c;//no assigned value
	String d;//no assigned value
	
	
	public void getMoney() {//not static method => need to create an object
		System.out.println(a);//default value = 0
		System.out.println(b);//default value = 0.0
		System.out.println(c);//default value = false
		System.out.println(d);//default value = null
	}
	
	public static void main(String[] args) {
		
		PracticeDataType obj = new PracticeDataType();
		
		obj.getMoney();
		
	}

}
