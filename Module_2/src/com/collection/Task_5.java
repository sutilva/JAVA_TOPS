/*
 * Write a Java program to update specific array element by given element.
 */


package com.collection;

import java.util.ArrayList;

public class Task_5 {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("White");
		al.add("Blue");
		al.add("Black");
		al.add("Green");
		al.add("Red");
		
		System.out.println("Old Value: " + al.get(2));
		
		al.set(2, "Pink");
		
		System.out.println("New Value: " + al.get(2));
	}
}