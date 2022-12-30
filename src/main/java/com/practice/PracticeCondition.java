package com.practice;

public class PracticeCondition {
	
	
	public void getCondition(String name) {
		
		if(name.contains("Rez")) {
			System.out.println("Found my name.");
		} else {
			System.out.println("Not found!");
		}
		
	}

	
	public static void main(String[] args) {
		
		PracticeCondition obj = new PracticeCondition();
		
		obj.getCondition("Rezwan");//Found my name
		
		obj.getCondition("Zakir");//Not found
		
		obj.getCondition("jaman");

	}

}
