package com.practice;

public class PracticeAccess {
	
	public static void getUser() {
		System.out.println("This is user");
	}
	
	private static void getPassword() {
		System.out.println("This is private.");
	}
	
	protected static void getLogin() {
		System.out.println("This is protected");
	}
	
	static void getLogout() {
		System.out.println("This is default");
	}

}
