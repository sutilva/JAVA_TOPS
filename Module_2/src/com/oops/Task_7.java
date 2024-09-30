/*
 * Create an abstract class 'Parent' with a method 'message'. 
 * It has two subclasses each having a method with the same name 'message' 
 * that prints "This is first subclass" and "This is second subclass" 
 * respectively. Call the methods 'message' by creating an object for each subclass. 
 * 
 */


package com.oops;

abstract class SuperClass {
	
	abstract void message();
}

class Subclass1 extends SuperClass {
	
	void message() {
		System.out.println("This is first subclass");
	}
}

class Subclass2 extends SuperClass {
	
	void message() {
		System.out.println("This is second subclass");
	}
}

public class Task_7 {
	public static void main(String[] args) {
		
		SuperClass sub1 = new Subclass1();
		SuperClass sub2 = new Subclass2();
		
		sub1.message();
		sub2.message();
	}
}
