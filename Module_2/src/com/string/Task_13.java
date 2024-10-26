package com.string;


class IntegerChar {
	
	protected void printNC (int a, char c) {
		
		System.out.println("Int = " + a);
		System.out.println("Char = " + c);
	}
	
	protected void printNC (char c, int a) {
		
		System.out.println("Char = " + c);
		System.out.println("Int = " + a);
	}
}

public class Task_13 {
	public static void main(String[] args) {
		
		IntegerChar ic = new IntegerChar();
		
		int a = 10;
		char c = 'a';
		
		ic.printNC(c, a);		
		System.out.println();
		ic.printNC(a, c);
	}
}
