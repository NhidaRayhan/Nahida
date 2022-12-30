package com.practice;

import java.util.HashSet;
import java.util.Set;

public class PracticeSet {

	//create a java collection and add values = 2, 4, 4, 5, 8, 9, 9 (int => Integer)
	//remove the duplicate values
	
	//Upcasting polymorphism => Interface<WrapperClass> collectionObject = new ClassName<>();
	
	Set<Integer> mySet = new HashSet<>();
	
	public Set<Integer> getSetValue() {
		
		mySet.add(2);
		mySet.add(4);
		mySet.add(4);
		mySet.add(5);
		mySet.add(8);
		mySet.add(9);
		mySet.add(9);
		
		System.out.println(mySet);
		return mySet;
	}
	
	public static void main(String[] args) {
		PracticeSet obj = new PracticeSet();
		
		obj.getSetValue();
	}
	
}
