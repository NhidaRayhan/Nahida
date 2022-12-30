package com.practice;

public class PracticeLooping {
	
	public void getLoop() {
		
		//Positive for loop => print out from 0 to 100
		//Formula for positive loop => for(start; end; ++)
//		for(int i=0;i<=100;i++) {
//			System.out.println(i);
//		}
		
		//Negative for loop => print out from 100 to 0
		//Formula for negative loop => for(end; start; --)
//		for(int i =100; i>=0; i--) {
//			System.out.println(i);
//		}
		
		
		//Infinite positive loop & how to stop it
		//write an infinite positive loop from 0 and stop it when i = 30
		for(int i=0; ;i++ ) {
			System.out.println(i);
			
			if(i==30) {
				break;
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		PracticeLooping obj = new PracticeLooping();
		
		obj.getLoop();
		
	}

}
