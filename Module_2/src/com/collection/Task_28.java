/*
 * Write a Java program to get a collection view of the values contained in this map.
 */


package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Task_28 {
    
	public static void main(String[] args) {		
        
        Map<Integer, String> map = new HashMap<>();        
        
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Grapes");
        
        // Get the collection view of the values in the map
        Collection<String> values = map.values();        
        
        System.out.println("Collection view of the values contained in the map:");
        for (String value : values) {
            System.out.println(value);
        }
    }
}

