/*
 * Write a Java program to get the number of elements in a hash set.
 */



package com.collection;

import java.util.HashSet;

public class Task_13 {

	public static void main(String[] args) {
		
		HashSet<Integer> hSet = new HashSet<>();
		
		hSet.add(1);
		hSet.add(2);
		hSet.add(3);
		hSet.add(4);
		hSet.add(5);
		
		
		System.out.println("Number of elements: " + hSet.size());
		
		}
}

