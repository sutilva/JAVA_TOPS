/*
 * Write a Java program to compare two sets and retain elements which are same on both sets.
 */

package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Task_27 {

	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        // Adding elements to the first set
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        
        // Adding elements to the second set
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);
        
        
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        
        // Retain common elements between set1 and set2
        set1.retainAll(set2);
        
        // Print the modified set1 which now contains only the common elements
        System.out.println("Common elements: " + set1);
	}
}
