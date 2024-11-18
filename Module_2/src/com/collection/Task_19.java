/*
 * Write a Java program of swap two elements in an array list.
 */





package com.collection;

import java.util.ArrayList;

public class Task_19 {
	
	static void swapListItem (int a, int b, ArrayList<Integer> al) {
		
		int temp = al.get(a);
		
		al.set(a, al.get(b));
		al.set(b, temp);
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<>();
		
		aList.add(23);
		aList.add(45);
		aList.add(98);
		aList.add(12);
		aList.add(4);
		aList.add(65);
		
		System.out.println("Before Swap: " + aList);
		
		swapListItem(1, 3, aList);
		
		System.out.println("After Swap: " + aList);
	}

}


