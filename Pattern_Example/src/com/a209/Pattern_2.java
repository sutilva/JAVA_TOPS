/*
Pattern 2

1
12
123
1234
12345

*/


package com.a209;

public class Pattern_2 {
	public static void main(String[] args) {
		int row = 5;
		
		for(int i = 1; i<=row; i++) {
			int col = i;
			for(int j = 1; j<=col; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

}
