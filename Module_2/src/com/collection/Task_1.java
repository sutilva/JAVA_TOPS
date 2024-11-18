/*
 * Write a Java program to create a new array list, add some colors (string) and print out the collection.
 */


package com.collection;

import java.util.ArrayList;

public class Task_1 {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("White");
		al.add("Blue");
		al.add("Black");
		al.add("Green");
		al.add("Red");
		
		System.out.println(al);
				
	}
}
