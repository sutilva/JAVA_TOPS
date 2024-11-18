/*
 * W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero exception and 
 * another one is to handle ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;
 */



package com.exception;

public class Task_2 {

	public static void main(String[] args) {
		
		int a [] = new int [5];
		int res = 0;
		try {
			res = 30/0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}		
		finally {
			try {
				a[5] = res;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
