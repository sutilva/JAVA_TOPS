/*
Pattern 10

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/


package com.a209;

public class Pattern_10 {
	public static void main(String[] args) {
		int row = 5;
		int val = 1;
		
		for(int i = 1; i<=row; i++) {
			int col = i;
			for(int j = 1; j<=col; j++) {
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}
	}

}
