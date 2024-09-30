/*
 * Write a Java program to display the system time. 
 */


package com.string;

import java.time.LocalTime;


public class Task_4 {
	public static void main(String[] args) {
		
        // Get the current time
        LocalTime currentTime = LocalTime.now();
        
              
        // Format the time        
        int hh = currentTime.getHour();
        int mm = currentTime.getMinute();
        int ss = currentTime.getSecond();
        System.out.println("Current system time: " + hh + ":" + mm + ":" + ss);
        
        
    }
}
