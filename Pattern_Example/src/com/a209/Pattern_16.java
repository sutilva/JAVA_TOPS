/*
Pattern 16

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/

package com.a209;

public class Pattern_16 {
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1; i <= row; i++) {
			
			//Loop for spaces
			for(int sp = i; sp < row; sp++) {
				System.out.print(" ");
			}
			
			//Loop for stars
			for(int st = 1; st <= i; st++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		row = 4;
		for(int i = 1; i <= row; i++) {
			
			//Loop for spaces
			for(int sp = 0; sp < i; sp++) {
				System.out.print(" ");
			}
			
			//Loop for stars
			for(int st = row; st >= i; st--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	

}
