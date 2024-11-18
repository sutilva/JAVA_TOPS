/*
 * Write a Java program to convert a hash set to a List/Array List.
 */


package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task_22 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hSet = new HashSet<>();
		
		hSet.add(10);
		hSet.add(20);
		hSet.add(30);
		hSet.add(40);
		hSet.add(50);
		
		List<Integer> list = new ArrayList<>(hSet);
		
		System.out.println("List: " + list);
		
	}

}
