/*
 * Write a Java program to compare two array lists.
 */



package com.collection;

import java.util.ArrayList;

public class Task_18 {
	
	public static void main(String[] args) {
		
		 	ArrayList<Integer> list1 = new ArrayList<>();
	        ArrayList<Integer> list2 = new ArrayList<>();
	        
	        // Adding elements to the first ArrayList
	        list1.add(10);
	        list1.add(20);
	        list1.add(30);
	        
	        // Adding elements to the second ArrayList
	        list2.add(10);
	        list2.add(20);
	        list2.add(30);	        
	        
	       
	        if (list1.equals(list2)) {
	            System.out.println("The two ArrayLists are equal.");
	        } 
	        
	        else {
	            System.out.println("The two ArrayLists are not equal.");
	        }
	}

}
