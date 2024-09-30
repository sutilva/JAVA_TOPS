package com.a209;

public class charPattern {
	public static void main(String[] args) {
		int row = 5;
		
		for(int i = 1; i <= row; i++) {
			
			int col = i;
			for(int j = 1; j<=col; j++) 
			{
				System.out.print(" "+(char)(64+i));
			}
			System.out.println();
		}
	}
}
