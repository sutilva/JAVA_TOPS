/* 
 * Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and 
 * perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to 
 * initialize the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its 
 * constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. 
 * Print the area and perimeter of a rectangle and a square. 
 */



package com.oops;

class Rectangle {
	int length;
	int breath;
	
	void displayArea() {
		
		int area = length * breath;
		System.out.println("Area: " + area);
	}
	
	void displayPerimeter() {
		
		int perimeter = 2 * (length+breath);
		System.out.println("Perimeter " + perimeter);
	}
	
	Rectangle(int length, int breath) {
		this.length = length;
		this.breath = breath;
	}
}

class Square extends Rectangle {
	
	Square(int s) {
		super(s, s);		
	}
	
}
	



public class Task_4 {
	
	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(4, 5);
		Square sq = new Square(5);
		
		//Area & Perimeter of Rectangle
		System.out.println("Area & Perimeter of Rectangle");
		rect.displayArea();
		rect.displayPerimeter();
		
		//Area & Perimeter of Square
		System.out.println("Area & Perimeter of Square");
		sq.displayArea();
		sq.displayPerimeter();
	}
}
