/*
 
 Pattern_8
  
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 
 */




package com.a209;

public class Pattern_8 {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row; i++) {
			
			//Printing Spaces
			for(int sp = i; sp < row; sp++) {
				System.out.print(" ");
			}
			
			//Printing numbers
			for(int num = 1; num <= i; num++) {
				System.out.print(num+" ");
			}
			
			System.out.println();
		}
	}

}
