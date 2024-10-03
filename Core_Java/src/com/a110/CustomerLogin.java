package com.a110;

public class CustomerLogin {
	
	private static String password = "shivT"; // Accessible only within the class CustomerLogin
	protected static boolean access = false; //Accessible within class, its subclass and classes in same package
		
	
	public static void getAccess(String pwd) {
		
		boolean password_check = password.equals(pwd);
		
		if(password_check == true) {
			access = true;
			System.out.println("Successfully Logged-in ;-)");
		}
		else {
			
			System.out.println("Access Denied :-( ");
			System.exit(0);
		}
	}
	

}
