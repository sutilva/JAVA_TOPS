/*
 * Write a Java program to associate the specified value with the specified key in a Hash Map.
 */



package com.collection;

import java.util.HashMap;

public class Task_14 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hp = new HashMap<>();
		
		hp.put(0, "Blue");
		hp.put(1, "Red");
		hp.put(2, "Green");
		hp.put(3, "Yellow");
		hp.put(4, "White");
		
		System.out.println(hp);
		
	}

}
