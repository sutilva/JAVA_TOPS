/*
 * 
 * Create a class named 'Shape' with a method to print "This is this is shape". Then create 
 * two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a 
 * method to print "This is rectangular shape" and "This is circular shape" respectively. 
 * Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". 
 * Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.
 * 
 */


package com.oops;

class ShapeDisplay {	
	void displayShape() {
		System.out.println("This is Shape");
	}
}

class RectangleShape extends ShapeDisplay {
	void rectDisplay() {
		System.out.println("This is Rectangular shape");
	}
}

class CircleShape extends ShapeDisplay {
	void cirDisplay() {
		System.out.println("This is Circular shape");
	}
}

class SquareShape extends RectangleShape {
	void squareDisplay() {
		System.out.println("Square is a rectangle");
	}
}

public class Task_13 {
	public static void main(String[] args) {
		SquareShape sq = new SquareShape();
		
		sq.displayShape();
		sq.rectDisplay();
		sq.squareDisplay();
	}
}
