/*
 * Write a Java program to sort a given array list.
 */


package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Task_8 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<>();
		
		aList.add(23);
		aList.add(45);
		aList.add(98);
		aList.add(12);
		aList.add(4);
		aList.add(65);
		
		System.out.println("Original List: " + aList);
		
		Collections.sort(aList);
		
		System.out.println("Sorted List: " + aList);
	}

}
