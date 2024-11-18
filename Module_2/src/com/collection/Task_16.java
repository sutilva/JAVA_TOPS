/*
 * Write a Java program to reverse elements in an array list.
 */


package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Task_16 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<>();
		
		aList.add(23);
		aList.add(45);
		aList.add(98);
		aList.add(12);
		aList.add(4);
		aList.add(65);
		
		System.out.println("Original List: " + aList);
		
		Collections.reverse(aList);
		
		System.out.println("Reversed List: " + aList);
	}

}
