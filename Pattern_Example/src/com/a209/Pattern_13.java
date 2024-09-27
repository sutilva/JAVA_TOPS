/* 
 Pattern 13
 
  *
  **
  ***
  ****
  *****
  ****
  ***
  **
  *
  
*/


package com.a209;

public class Pattern_13 {
	public static void main(String[] args) {
		
		int row = 5;
		
		//Ascending order
		for(int i = 1; i <= row; i++) {
			int col = i;
			for(int j = 1; j <= col; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		//Descending order
		row = 4;
		for(int i = row; i >= 1; i--) {
			int col = i;
			for(int j = col; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
