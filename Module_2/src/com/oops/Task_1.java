/*

Create a class to print the area of a square and a rectangle. 
The class has two methods with the same name but different 
number of parameters. The method for printing area of a rectangle 
has two parameters which are length and breadth respectively 
while the other method for printing area of square has one parameter which is side of square.

*/



package com.oops;

import java.util.Scanner;

class Area {
	
	public int getArea(int l, int b) {
		
		int a = l*b;
		return a;
		
	}
	
	public int getArea(int s) {
		
		int a = s*s;		
		return a;
	}
	
	
}




public class Task_1 {
	public static void main(String[] args) {
		
		System.out.println("Enter Lenght and Breath of Rectangle ");
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		
		Area a = new Area();
		
		int areaRectangle = a.getArea(l, b);
		System.out.println("Area of Rectangle: " + areaRectangle);
		
		
		System.out.println("Enter side of Square ");
		
		
		int s = sc.nextInt();
		
		int areaSquare = a.getArea(s);
		System.out.println("Area of Square: " + areaSquare);
		
		sc.close();
	}
}
