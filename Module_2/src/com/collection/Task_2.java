/*
 * Write a Java program to iterate through all elements in an array list.
 */



package com.collection;

import java.util.ArrayList;
import java.util.Iterator;



public class Task_2 {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("White");
		al.add("Blue");
		al.add("Black");
		al.add("Green");
		al.add("Red");
		
		Iterator<String> i = al.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}		
	}
}
