package com.a110;

public class AccountAction extends CustomerLogin {
	
	protected static double currentBalance = 0;
	
	 
	 AccountAction (double init_balance) {		 
		 currentBalance = init_balance;
	 }
	 
	 static void balanceDisplay() {
		 
		 if(access == true) {
			 System.out.println("Current Balance = " + currentBalance);
		 }
		 else {
			 
			 System.out.println("Access Denied !! Cannot show current balance !!");
		 }
	 }
	 
	 static void withdrawAmount (double amount) {
		 if(access == true && currentBalance >= amount && amount > 0 ) {
			 currentBalance -= amount;
			 System.out.println("Successfully Withdrawn !!");
		 }
		 else {
			 System.out.println("Access Denied or Insufficient Balance !!");
		 }
	 }
	 
	 static void depositAmount (double amount) {
		 if (access == true && amount > 0) {
			 currentBalance += amount;
			 System.out.println("Successfully Deposited :-) ");
		 }
		 else {
			 System.out.println("Access Denied or Invalid Amount :-( ");
		 }
	 }

}
