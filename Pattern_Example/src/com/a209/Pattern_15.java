/*

Pattern 15

**********  sp = 0
****  ****  sp = 2
***    ***  sp = 4
**      **  sp = 6
*        *  sp = 8

*/

package com.a209;

public class Pattern_15 {
	public static void main(String[] args) {
		
		int row = 5;
		int sp = 0;
		
		for(int i = 1; i <= row; i++) {
			
			//Printing stars
			for(int st = row; st >= i; st--) {
				System.out.print("* ");
			}
			
			//Printing space
			for(int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			
			//Printing stars
			for(int st = row; st >= i; st--) {
				System.out.print("* ");
			}
			
			System.out.println();
			sp+=2;
		}
	}
}
