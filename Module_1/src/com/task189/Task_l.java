package com.task189;

import java.util.Scanner;

public class Task_l {
	public static void main(String[] args) {
	
		System.out.println("Enter M for Monday");
		System.out.println("Enter T for Tuesday");
		System.out.println("Enter W for Wednesday");
		System.out.println("Enter Th for Thursday");
		System.out.println("Enter F for Friday");
		System.out.println("Enter S for Saturday");
		System.out.println("Enter Sun for Sunday");
		System.out.println("");
		System.out.println("Enter your choice");
		
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		switch(choice) {
		case "M": System.out.println("Monday");
		break;
		
		case "T": System.out.println("Tuesday");
		break;
		
		case "W": System.out.println("Wednesday");
		break;
		
		case "Th": System.out.println("Thursday");
		break;
		
		case "F": System.out.println("Friday");
		break;
		
		case "S": System.out.println("Saturday");
		break;
		
		case "Sun": System.out.println("Sunday");
		break;
		
		default: System.out.println("Invalid choice");
		break;
		}
		
	}

}
