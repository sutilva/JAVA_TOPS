/*
 * Write a Java program to search an element in an array list.
 */



package com.collection;

import java.util.ArrayList;

public class Task_7 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("White");
		al.add("Blue");
		al.add("Black");
		al.add("Green");
		al.add("Red");
		
		System.out.println("List Contains Red ? " + al.contains("Red"));
	}
}
