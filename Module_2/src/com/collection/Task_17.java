/*
 * Write a Java program to extract a portion of an array list.
 */



package com.collection;

import java.util.ArrayList;
import java.util.List;

public class Task_17 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<>();
		
		aList.add(23);
		aList.add(45);
		aList.add(98);
		aList.add(12);
		aList.add(4);
		aList.add(65);
		
		System.out.println("Original List: " + aList);
		
		List<Integer> portionArrayList = aList.subList(1, 4);
		
		System.out.println("Extracted List: " + portionArrayList);
		
		
	}

}
