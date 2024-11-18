/*
 * Write a Java program to convert a hash set to an array.
 */


package com.collection;

import java.util.HashSet;

public class Task_21 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hSet = new HashSet<>();
		
		hSet.add(10);
		hSet.add(20);
		hSet.add(30);
		hSet.add(40);
		hSet.add(50);
		
		Integer[] array = new Integer[hSet.size()];		
		
		hSet.toArray(array);
		System.out.println("Array: ");
		
		for (Integer num : array) {
			
			System.out.print(num + " ");
		}
	}

}
