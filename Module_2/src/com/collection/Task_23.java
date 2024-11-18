/*
 * Write a Java program to check whether a map contains key-value mappings (empty) or not.
 */



package com.collection;

import java.util.HashMap;

public class Task_23 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hp = new HashMap<>();
		
		System.out.println("Before adding elements: Is empty ? " + hp.isEmpty());
		
		hp.put(1, "Shiv");
		
		System.out.println("After Adding element: Is Empty ? " + hp.isEmpty());
	}

}
