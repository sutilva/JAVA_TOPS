/*
Pattern 14

* * * * *
 * * * *
  * * *
   * *
    *

*/


package com.a209;

public class Pattern_14 {
	public static void main(String[] args) {
		
		int row = 5;
		
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
