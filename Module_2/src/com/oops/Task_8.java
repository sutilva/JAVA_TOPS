/*
 * Create an abstract class 'Bank' with an abstract method 'getBalance'. 
 * $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' 
 * and 'BankC'are subclasses of class 'Bank', each having a method named 'getBalance'. 
 * Call this method by creating an object of each of the three classes. 
 */


package com.oops;

abstract class Bank {
	
	abstract int getBalance ();
}

class BankA extends Bank {
	
	
	int getBalance() {
		
		int deposit = 100;
		return deposit; 
	}
}

class BankB extends Bank {
	
	
	int getBalance() {
		
		int deposit = 150;
		return deposit; 
	}
}

class BankC extends Bank {
	
	
	int getBalance() {
		
		int deposit = 200;
		return deposit; 
	}
}

public class Task_8 {
	public static void main(String[] args) {
		
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		BankC bankC = new BankC();
		
		int depositA = bankA.getBalance();
		System.out.println("Bank-A Deposits -> " + depositA);
		
		int depositB = bankB.getBalance();
		System.out.println("Bank-B Deposits -> " + depositB);
		
		int depositC = bankC.getBalance();
		System.out.println("Bank-C Deposits -> " + depositC);
		
		
	}
}
