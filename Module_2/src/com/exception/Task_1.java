/*
 * W.A.J. P to demonstrate try catch block,Take two numbers from the user and perform 
 * the division operation and handle Arithmetic Exception. O/P- Enter two numbers: 10 0
 */

package com.exception;

public class Task_1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			int c = a/b;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
