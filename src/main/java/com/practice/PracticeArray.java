package com.practice;

import java.util.Arrays;

public class PracticeArray {
	
	int a = 2;
	int[] b = {10, 20, 30, 40, 50};//length of b = 5 => single dimension
	int[] c = {12, 15, 16, 18};//length of c = 4 => single dimension
	int[][] d = {{10, 20, 30, 40, 50}, {12, 15, 16, 18}}; //multi-dimension
	int[][]e = {{1,2,3},{4,5,6},{7,8,9}};
	
	
	public void getArray() {
		
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println("Length of b=" +b.length);
		System.out.println("Length of c=" +c.length);
		System.out.println(Arrays.deepToString(d));
		System.out.println(Arrays.deepToString(e));
		
	}
	
	public static void main(String[] args) {
		
		PracticeArray obj = new PracticeArray();
		
		obj.getArray();
		
	}

}
