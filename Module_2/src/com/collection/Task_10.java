/*
 * Write a Java program to shuffle elements in an array list.
 */



package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Task_10 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("White");
		al.add("Blue");
		al.add("Black");
		al.add("Green");
		al.add("Red");
		
		System.out.println("Original List: " + al);
		
		Collections.shuffle(al);
		
		System.out.println("Shuffled List: " + al);
	}

}
