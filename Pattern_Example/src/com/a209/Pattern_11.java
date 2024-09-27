/*
 
 
 Pattern_11
 
 1
 0 1
 1 0 1
 1 0 1 0
 1 0 1 0 1  
  
  
 */






package com.a209;

public class Pattern_11 {
	public static void main(String[] args) {
		int row = 5;
		int val = 1;
		
		for(int i = 1; i<=row; i++) {
			int col = i;
			
			// 2nd row starts with "0"
			if (i == 2) {
				val = 0;
				
				for(int k = 1; k<=col; k++) {
					
					if(val == 1) {
						System.out.print(val+" ");
						val=0;						
					}
					else {
						System.out.print(val+" ");
						val=1;
					}
				}
			}
			else {
				for(int j = 1; j<=col; j++) {
					if(val == 1) {
						System.out.print(val+" ");
						val=0;						
					}
					else {
						System.out.print(val+" ");
						val=1;
					}
				}
			}
			System.out.println();
			val=1;
		}
	}
}
		