package com.practice;

public class PracticeUncheckedException {
	
	public int a = 5;
	
	public void getSalary() {
		System.out.println("This is the first method.");
	}
	
	public void getMiddle() {
		try {
			System.out.println(a/0);//code
		} catch (Exception e) {
			// Handle the exception
			e.printStackTrace();
		} finally {
			//
		}
	} 
	
	public void getMoney() {
		System.out.println("This is the last method.");
	}
	
	public static void main(String[] args) {
		
		PracticeUncheckedException obj = new PracticeUncheckedException();
		
		obj.getSalary();
		
		obj.getMiddle();
		
		obj.getMoney();
		
	}

}
