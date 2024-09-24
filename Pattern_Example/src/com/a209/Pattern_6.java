/*

Pattern 6
    
    *
   ** 
  ***
 ****
*****

*/


package com.a209;

public class Pattern_6 {
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row; i++) {
			
			//Loop for printing space
			for(int sp = i; sp < row; sp++) {
				System.out.print(" ");
			}
			//Loop for printing stars
			for(int st = 1; st <= i; st++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
