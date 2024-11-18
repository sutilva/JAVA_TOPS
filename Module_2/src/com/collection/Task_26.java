/*
 * Write a Java program to print all the elements of an Array List using the position of the elements.
 */



package com.collection;

import java.util.ArrayList;

public class Task_26 {
	
	public static void main(String[] args) {
		
		 ArrayList<Integer> list = new ArrayList<>();	        
	     
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 list.add(40);
		 list.add(50);
		        
	     
	     System.out.println("Elements of the ArrayList using positions:");
	        
	     for (int i = 0; i < list.size(); i++) {
	            // Access each element by its index
	    	 System.out.println("Element at position " + i + ": " + list.get(i));
	     }
	}

}
