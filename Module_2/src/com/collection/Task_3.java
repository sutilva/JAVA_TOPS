/*
 * Write a Java program to insert an element into the array list at the first position.
 */


package com.collection;

import java.util.ArrayList;

public class Task_3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add(0, "First Position");
		
		System.out.println(al.get(0));
	}
}
