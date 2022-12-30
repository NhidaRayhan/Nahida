package com.practice;

public class PracticeReverse {
	
	public void getStringReverse() {
		
		String country = "United States of America";
		
		country.length();
		
		System.out.println(country.length());
		
		for(int i =(country.length()-1); i>=0;i-- ) {
			System.out.print(country.charAt(i));
		}
		
	}
	
	public static void getReverseWithStringBuilder(String mycountry) {
		StringBuilder obj2 = new StringBuilder(mycountry);
		
		System.out.println(obj2.reverse());
	}
	
	public static void main(String[] args) {
		
		PracticeReverse obj = new PracticeReverse();
		
		obj.getStringReverse();
		
		getReverseWithStringBuilder("United Kingdom");
		
	}

}
