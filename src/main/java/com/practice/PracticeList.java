package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeList {
	
	public List<Integer> getArrayValue() {
	
		//Formula for creating an object using class
		//ClassName obj = new ClassName();
		//Create an object of Interface? => NOT POSSIBLE
		//create a list and add values = 2, 4, 4, 5, 8, 9 (int => Integer)
		List<Integer> myList = new ArrayList<>();//Upcasting polymorphism => Interface<WrapperClass> collectionObject = new ClassName<>();
		
		//add the values to myList
		myList.add(2);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(8);
		myList.add(9);
		
		System.out.println(myList);
		System.out.println(myList.size());
		return myList;
	}
	
	public static void main(String[] args) {
		PracticeList obj = new PracticeList();
		obj.getArrayValue();
		
	}

}
