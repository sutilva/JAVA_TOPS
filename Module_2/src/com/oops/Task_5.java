/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by 
 * creating a class named 'Triangle' without any parameter in its constructor.
 */



package com.oops;

class Triangle {
	
	int length = 3, width = 4, height = 5;
	int perimeter = length + width + height;
	double area = (height*width) / 2;
	
	Triangle() {

			System.out.println("Perimeter: " + perimeter);
			System.out.println("Area: " + area);
			
		}
	
	
	
}

public class Task_5 {
	
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		
	}
}
