package com.practice;

public abstract class Father {
	
	
	public void getMoney() {//not a static method => need to create an object
		System.out.println("Inherited from Father.");
	}
	
	public abstract void getName();

}
