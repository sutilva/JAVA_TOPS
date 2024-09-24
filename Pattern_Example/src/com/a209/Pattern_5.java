/*
 Pattern_5
 
    1
   21
  321
 4321
54321

*/

package com.a209;

public class Pattern_5 {
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row; i++) {
			
			//Loop for printing space
			for(int sp = i; sp < row; sp++) {
				System.out.print(" ");
			}
			//Loop for printing numbers
			for(int num = i; num >= 1; num--) {
				System.out.print(num);
				
			}
			System.out.println();
		}
		
	}
}
	
