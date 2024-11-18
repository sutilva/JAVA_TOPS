/*
 * Write a Java program to count the number of key-value (size) mappings in a map.
 */



package com.collection;

import java.util.HashMap;

public class Task_15 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hp = new HashMap<>();
		
		hp.put(0, "Blue");
		hp.put(1, "Red");
		hp.put(2, "Green");
		hp.put(3, "Yellow");
		hp.put(4, "White");
		
		System.out.println("Size of HashMap: " + hp.size());
		
	}

}
