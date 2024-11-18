/*
 * Write a Java program to increase the size of an array list.
 */



package com.collection;

import java.util.ArrayList;

public class Task_24 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
	    list1.add(20);
	    list1.add(30);
	    
	    //ensureCapacity method is used to increase the size 
	    //Now it can store upto 20 elements 
	    list1.ensureCapacity(20);
	    
	    
	}
}
