// Write A Java Program to take two Array input from user and 
// sort them in ascending or descending order as per user’s choice 


package com.array;

import java.util.Scanner;


public class Task_3 {
	
	
	 public static void bubbleSort(int[] array, int choice) {
	        int n = array.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1 - i; j++) {
	                if ((choice == 1 && array[j] > array[j + 1]) || (choice == 2 && array[j] < array[j + 1])) {
	                   
	                	// Swap array[j] and array[j+1]
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    }

	    // Print the array
	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of both arrays: ");
		int size = sc.nextInt();
		
		//First Array		
		System.out.println("Enter values for Array-1: ");
		
		int [] arr1 = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr1[i] = sc.nextInt();
		}
		
		// Second Array
		
		 System.out.println("Enter values for Array-2: ");
		int [] arr2 = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr2[i] = sc.nextInt();
		}
		
		System.out.println("Enter your choice: Ascending (1) or Descending (2)");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1: {
			
			bubbleSort(arr1, 1);
			printArray(arr1);
			bubbleSort(arr2, 1);
			printArray(arr2);
			break;
		}
		
		case 2: {
			
			bubbleSort(arr1, 2);
			printArray(arr1);
			bubbleSort(arr2, 2);
			printArray(arr2);
			break;
		}
		
		default:
			System.out.println("Enter valid choice!!");
			break;
		}		
	}
}
