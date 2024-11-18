/*
 * Write a Java program to iterate through all elements in a hash list.
 */


package com.collection;

import java.util.HashSet;

public class Task_12 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hSet = new HashSet<>();
		
		hSet.add(1);
		hSet.add(2);
		hSet.add(3);
		hSet.add(4);
		hSet.add(5);
		
		
		for (Number number : hSet) {
			
			System.out.print(number + " ");
		}
	}

}
