/*
Pattern_12

1
4 4
9 9 9
16 16 16 16
25 25 25 25 25

*/


package com.a209;

public class Pattern_12 {
	
	public static void main(String[] args) {
	int row = 5;
	int val = 1;
	
	for(int i = 1; i<=row; i++) {
		int col = i;
		val = i*i;
		for(int j = 1; j<=col; j++) {
			System.out.print(val+" ");
			
			}
		System.out.println();
		}

	}
}
