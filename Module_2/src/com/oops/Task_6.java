/*
 * Print the sum, difference and product of two complex numbers by creating a class named 'Complex' 
 * with separate methods for each operation whose real and imaginary parts are entered by user. 
 */



package com.oops;

import java.util.Scanner;

class Complex {
	
	int real1, real2;
	int img1, img2;
	 
	
	
	Complex(int real1, int img1, int real2, int img2) {
		
		this.real1 = real1;
		this.img1 = img1;
		this.real2 = real2;
		this.img2 = img2;
		
	}
	
	public void sumOfImaginaryNumber() {
		int sumReal = real1 + real2;
		int sumImg = img1 + img2;
		
		System.out.println(sumReal+" + i"+sumImg);
		
	}
	
	public void differenceOfImaginaryNumber() {
		int diffReal = real1 - real2;
		int diffImg = img1 - img2;
		
		if (diffImg > 0) {
			System.out.println(diffReal+" + i"+diffImg);
		}
		
		else {
			diffImg = diffImg * (-1);
			System.out.println(diffReal+" - i"+diffImg);
		}
	}
	
	public void productOfImaginaryNumber() {
		
		int productReal = ((real1 * real2) - (img1*img2));
		int productImg = ((real1*img2) + (img1*real2));
		
		if(productImg > 0) {
			System.out.println(productReal + " + i" + productImg);
		}
		else {
			productImg = productImg*(-1);
			System.out.println(productReal + " - i" + productImg);
		}
	}
}

public class Task_6 {
	public static void main(String[] args) {
		
		int real1, real2;
		int img1, img2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Real part of Imaginary Number-1: ");
		real1 = sc.nextInt();
		
		System.out.println("Enter Imaginary part of Imaginary Number-1: ");
		img1 = sc.nextInt();
		
		System.out.println("Enter Real part of Imaginary Number-2: ");
		real2 = sc.nextInt();
		
		System.out.println("Enter Imaginary part of Imaginary Number-2: ");
		img2 = sc.nextInt();
		
		Complex c1 = new Complex(real1, img1, real2, img2);
		
		System.out.println();
		System.out.println("Enter your choice: ");
		System.out.println("1 -> Addition");
		System.out.println("2 -> Difference");
		System.out.println("3 -> Product");
		
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
			{				
				c1.sumOfImaginaryNumber();
				break;
			}
			case 2:
			{
				c1.differenceOfImaginaryNumber();
				break;
			}
			case 3:
			{
				c1.productOfImaginaryNumber();
				break;
			}
			default:
			{
				System.out.println("Invalid Choice !!");
				break;
			}
			
		}
		sc.close();
	}
}
