/*
 * Create a class with a method that prints "This is a parent class" and its subclass with another method 
 * that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class 
 * by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object 
 * of child class 
 * 
 */


package com.oops;


class Parent {
	
	public void p() {
		System.out.println("This is a parent class");
	}
	
}

class Child extends Parent {
	
	public void c() {
		System.out.println("This is a child class");
	}
	
}



public class Task_2 {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child = new Child();
		
		//Calling method of parent class by its own object
		parent.p();
		
		//Calling method of child class by its own object
		child.c();
		
		//Calling method of parent class by object of child class
		child.p();
		
	}
	
}
