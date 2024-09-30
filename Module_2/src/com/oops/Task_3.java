/*
 * Create a class named 'Member' having the following members: 
 * 1. Data members 
 * 2. Name 
 * 3. Age 
 * 4. Phone number 
 * 5. Address 
 * 6. Salary 
 * It also has a method named 'printSalary' which prints the salary of the members.
 * 
 */



package com.oops;

class Member {
	int memberId;
	String name;
	int age;
	int phoneNumber;
	String address;
	int salary;	
	
	Member(int memberId, String name, int age, int phoneNumber, String address, int salary) {
		this.memberId = memberId;
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	
	public void printSalary (int salary) {
		System.out.println("Salary: " + salary);
	}
	

}

public class Task_3 {
	
	public static void main(String[] args) {
		
		Member m1 = new Member(1, "Shiv", 29, 123456789, "Rajkot", 100000);
		
		m1.printSalary(m1.salary);
	}
	
	
}
