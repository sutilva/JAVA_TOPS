/*
 * We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 
 * 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 
 * 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' 
 * are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is 
 * its radius. Now create another class 'Area' containing all the three methods 'RectangleArea',
 * 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle 
 * respectively. Create an object of class 'Area' and call all the three methods.
 */


package com.oops;

import java.util.Scanner;

abstract class Shape {
	
	abstract int rectangleArea(int length, int breadth);
	abstract int squareArea(int side);
	abstract double circleArea(int radius);	
	
}

class AreaofShape extends Shape {
	
	int rectangleArea(int length, int breadth) {		
		return length*breadth;
	}
	
	int squareArea(int side) {
		return side*side;
	}
	
	double circleArea (int radius) {
		return 3.14*radius*radius;
	}
	
}

public class Task_11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AreaofShape area = new AreaofShape();
		
		
		//Rectangle
		System.out.println("Enter lenght & breadth of Rectangle:");
		int length = sc.nextInt();
		int breadth = sc.nextInt();
		
		int rectArea = area.rectangleArea(length, breadth);
		System.out.println("Rectangle Area: " + rectArea);
		System.out.println();
		
		//Square
		System.out.println("Enter the side of Square:");
		int side = sc.nextInt();
		
		int sqArea = area.squareArea(side);
		System.out.println("Square Area: " + sqArea);
		System.out.println();
		
		//Circle
		System.out.println("Enter the radius of Circle:");
		int radius = sc.nextInt();
		
		double cirArea = area.circleArea(radius);
		System.out.println("Circle Area: " + cirArea);
		
		sc.close();
		
	
	}

}
