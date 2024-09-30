/*
 * 
 * We have to calculate the percentage of marks obtained in three subjects (each out of 100) 
 * by student A and in four subjects (each out of 100) by student B. Create an abstract class 
 * 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' 
 * and 'B' each having a method with the same name which returns the percentage of the students. 
 * The constructor of student A takes the marks in three subjects as its parameters and 
 * the marks in four subjects as its parameters for student B. Create an object for each of 
 * the two classes and print the percentage of marks for both the students.
 * 
 */


package com.oops;

import java.util.Scanner;

abstract class Marks {
	
	abstract double getPercentage();
}

class A extends Marks {
	
	double sub1, sub2, sub3, sub4;
	
	
	A(double sub1, double sub2, double sub3) {
		
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		
		
	}
	
	double getPercentage() {
		
		double percentage = (sub1 + sub2 + sub3) / 3;
		return percentage;
	}
}

class B extends Marks {
	
	double sub1, sub2, sub3, sub4;
	
	
	B(double sub1, double sub2, double sub3, double sub4) {
		
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		
	}
	
	double getPercentage() {
		
		double percentage = (sub1 + sub2 + sub3 + sub4) / 4;
		return percentage;
	}
}

public class Task_9 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double sub1, sub2, sub3, sub4;
		
		System.out.println("Enter the marks of 3 subjects of Student-A out of 100 -> ");
		sub1 = sc.nextDouble();
		sub2 = sc.nextDouble();
		sub3 = sc.nextDouble();
		
		A a1 = new A(sub1, sub2, sub3);
		System.out.println("Percentage of Student-A: " + a1.getPercentage() + "%");
		
		
		System.out.println("Enter the marks of 4 subjects of Student-B out of 100 -> ");
		sub1 = sc.nextDouble();
		sub2 = sc.nextDouble();
		sub3 = sc.nextDouble();
		sub4 = sc.nextDouble();
		
		B b1 = new B(sub1, sub2, sub3, sub4);
		System.out.println("Percentage of Student-B: " + b1.getPercentage() + "%");
		
		sc.close();
		
	}
}
