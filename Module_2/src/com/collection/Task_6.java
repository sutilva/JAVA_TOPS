/*
 * Write a Java program to remove the third element from an array list.
 */



package com.collection;

import java.util.ArrayList;

public class Task_6 {
	
public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("White");
		al.add("Blue");
		al.add("Black");
		al.add("Green");
		al.add("Red");
		
		System.out.println("Before Removal: " + al);
		
		al.remove(2);
		
		System.out.println("After Removal: " + al);
	}

}
