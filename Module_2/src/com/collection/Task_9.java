/*
 * Write a Java program to copy one array list into another.
 */


package com.collection;

import java.util.ArrayList;

public class Task_9 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("White");
		al.add("Blue");
		al.add("Black");
		al.add("Green");
		al.add("Red");
		
		ArrayList<String> copy_al = new ArrayList<>(al);
		
		System.out.println(copy_al);
	}
}
