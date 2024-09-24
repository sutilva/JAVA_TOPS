/*
 
 Pattern_9
  
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
 
 */




package com.a209;

public class Pattern_9 {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row; i++) {
			
			//Printing Spaces
			for(int sp = i; sp < row; sp++) {
				System.out.print(" ");
			}
			
			//Printing numbers
			for(int num = 1; num <= i; num++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}
	}

}