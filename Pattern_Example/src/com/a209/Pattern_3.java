/*

Pattern 3

1
22
333
4444
55555

*/




package com.a209;

public class Pattern_3 {
	public static void main(String[] args) {
		int row = 5;
		
		for(int i = 1; i<=row; i++) {
			int col = i;
			for(int j = 1; j<=col; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

}
