package com.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Emp
{
	String ename;
	int salary;
	
	public Emp(String name,int sal) 
	{
		ename=name;
		salary=sal;
	}
}

class SalCompare implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		int value = 0;
		
		if(o1.ename.toLowerCase().charAt(0) > o2.ename.toLowerCase().charAt(0)) {
			return 1;
		}else if(o1.ename.toLowerCase().charAt(0) < o2.ename.toLowerCase().charAt(0)) {
			return -1;
		}else if(o1.ename.toLowerCase().charAt(0) == o2.ename.toLowerCase().charAt(0)) {
			return 0;
		}
		return value;
		
	}
	
}
public class ComparatorEx
{
	public static void main(String[] args) 
	{
		
		ArrayList<Emp> al = new ArrayList<Emp>();
		Scanner sc = new Scanner(System.in);
		Emp emp;
		String name = null;
		int salary = 0;
		
		System.out.println("Enter 5 name and salary");
		
		for(int i = 0; i<5 ; i++) {
			
			System.out.println("Name");
			name = sc.next();
			
			System.out.println("Salary");
			salary = sc.nextInt();
			
			emp = new Emp(name, salary);
			al.add(emp);
			
		}
		
		
		Collections.sort(al, new SalCompare());
		
		for(Emp e :al) 
		{
			System.out.println(e.salary+"   "+e.ename);
		}
		sc.close();
	}
}
