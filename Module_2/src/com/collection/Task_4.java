/*
 * Write a Java program to retrieve an element (at a spec. index) from a given array list.
 * 
 */


package com.collection;

import java.util.ArrayList;

public class Task_4 {
	
public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("White");
		al.add("Blue");
		al.add("Black");
		al.add("Green");
		al.add("Red");
		
		System.out.println(al.get(3));
	}
}
