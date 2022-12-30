package com.practice;

public class PracticeVariable {
	
	int a = 10;
	int b = 15;
	
	double db = 15.7;
	
	boolean c = true;
	
	String s = "Batch 30";
	
	public void getSum() {
		System.out.println("This is summation="+ (a+b));//25
		System.out.println(db);
		System.out.println(c);
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		PracticeVariable obj = new PracticeVariable();
		
		obj.getSum();
		
	}

}
