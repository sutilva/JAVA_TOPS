/*
 * Write a Java program to append the specified element to the end of a hash set.
 */



package com.collection;

import java.util.HashSet;

public class Task_11 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hSet = new HashSet<>();
		
		hSet.add(1);
		hSet.add(2);
		hSet.add(3);
		hSet.add(4);
		hSet.add(5);
		
		System.out.println("Original HashSet: " + hSet);
		
		hSet.add(6);
		
		System.out.println("After adding new element: " + hSet);
		
	}

}
