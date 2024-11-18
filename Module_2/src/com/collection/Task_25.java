/*
 * Write a Java program to replace the second element of an Array List with the specified element.
 */



package com.collection;

import java.util.ArrayList;

public class Task_25 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
	    list1.add(20);
	    list1.add(30);
	    list1.add(40);
	    list1.add(50);
	    list1.add(60);
	    
	    System.out.println("Before Replacing: " + list1);
	    
	    //Replacing the element
	    list1.set(1, 70);
	    
	    System.out.println("After Replacing: " + list1);
	    
	}

}
