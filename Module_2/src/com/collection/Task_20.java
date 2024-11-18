package com.collection;

import java.util.ArrayList;

public class Task_20 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        // Adding elements to the first ArrayList
        list1.add(10);
        list1.add(20);
        list1.add(30);
        
        // Adding elements to the second ArrayList
        list2.add(40);
        list2.add(50);
        list2.add(60);	
        
        list1.addAll(list2);
        
        
        System.out.println("After Joining: " + list1);
	}

}
