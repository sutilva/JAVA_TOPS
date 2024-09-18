package com.task189;

import java.util.Scanner;

public class Task_n {
	
	public static void main(String[] args) {
		
		System.out.println("Enter 1 for Area of Triangle");
		System.out.println("Enter 2 for Area of Rectangle");
		System.out.println("Enter 3 for Area of Circle");
		
		double area;
		
		System.out.println("");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter height: ");
			int h = sc.nextInt();
			System.out.println("Enter base: ");
			int b = sc.nextInt();
			
			area = (h*b)/2;	
			System.out.println("Area: "+ area);
		}
		else if(choice == 2) {
			System.out.println("Enter length: ");
			int l = sc.nextInt();
			System.out.println("Enter width: ");
			int w = sc.nextInt();
			
			area = l * w;
			System.out.println("Area: "+ area);
		}
		else if(choice == 3) {
			
			System.out.println("Enter radius: ");
			int r = sc.nextInt();
			
			area = 3.14*r*r;
			System.out.println("Area: "+ area);
		}
		else {
			System.out.println("Invalid choice!!");
		}
		
		
	}

}
