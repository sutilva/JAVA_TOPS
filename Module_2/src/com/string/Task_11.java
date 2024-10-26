
//W.A.J.P to find the second most frequent character in a given string. 
//The given string is: successes The second most frequent char in the string is: c

package com.string;

import java.util.Scanner;

public class Task_11 {

    public static char findSecondMostFrequent(String str) {
    	
        // Step 1: Create an array to count character frequencies
        int[] frequency = new int[256]; // Assuming ASCII characters

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        // Step 2: Find the first and second most frequent characters
        int firstMax = 0, secondMax = 0;
        char firstChar = '\0', secondChar = '\0';

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > firstMax) {
                secondMax = firstMax;
                secondChar = firstChar;
                firstMax = frequency[i];
                firstChar = (char) i;
            } else if (frequency[i] > secondMax && frequency[i] < firstMax) {
                secondMax = frequency[i];
                secondChar = (char) i;
            }
        }

        // Check if we found a second most frequent character
        if (secondChar == '\0') {
            throw new IllegalArgumentException("No second most frequent character found.");
        }

        return secondChar;
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter the string");
        String input = sc.next();
        
        try {
            char secondMostFrequent = findSecondMostFrequent(input);
            System.out.println("The second most frequent character is: " + secondMostFrequent);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}

