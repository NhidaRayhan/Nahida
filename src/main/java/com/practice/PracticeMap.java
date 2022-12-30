package com.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class PracticeMap {
	
	public void getMapValue() {
		
		//Upcasting polymorphism => 
		//Interface<DataType, DataType> collectionObject = new ClassName<>();
		
		//Write name & city of a person => Michael, NewYork
		
		Map<String, String> myMap = new LinkedHashMap<>();
		
		myMap.put("Name", "Michael");
		myMap.put("City", "Bronx");
		myMap.put("State", "New York");
		
		System.out.println(myMap);
	}
	
	public static void main(String[] args) {
		PracticeMap obj = new PracticeMap();
		
		obj.getMapValue();
	}

}
