package com.task179;
import java.lang.Math;

public class Task_5 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 8;
		
		double s = (a+b+c)/2;
		double z = s*(s-a)*(s-b)*(s-c); 
		
		double areaTriangle = Math.sqrt(z);
		
		System.out.println(areaTriangle);
		
	}

}
