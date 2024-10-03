package com.a110;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Enter Password for Login
		System.out.println("Enter your password for access: ");
		String yourPass = sc.next();

		CustomerLogin cl = new CustomerLogin();
		cl.getAccess(yourPass);
		
		//Trying to access protected member of class CustomerLogin by object of the same class
		//String password = cl.password;
		
		try {
			boolean try_access = cl.access;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
		

		// Set Initial Balance
		System.out.println("Deposit Initial Amount");
		double init_amount = sc.nextDouble();

		AccountAction aa = new AccountAction(init_amount);
		aa.balanceDisplay();
		
		//Trying to access protected member of class CustomerLogin by object of the AccountAction class
		//String password = aa.password; 

		System.out.println();
		System.out.println("Choose from following option: ");
		System.out.println("1 -> Deposit Amount");
		System.out.println("2 -> Withdraw Amount");
		System.out.println();

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Enter amount to be deposited: ");
			double amtDeposit = sc.nextDouble();
			aa.depositAmount(amtDeposit);
			aa.balanceDisplay();
			break;

		case 2:
			System.out.println("Enter amount to be deposited: ");
			double amtWithdraw = sc.nextDouble();
			aa.withdrawAmount(amtWithdraw);
			aa.balanceDisplay();
			break;

		default:
			System.out.println("Invalid Choice !!");
			aa.balanceDisplay();
			break;
		}

		sc.close();
	}
}
