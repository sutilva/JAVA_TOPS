/*
 * W.A.J.P to create 2 threads and execute that threads by providing sleep 
 * time as 2000ms and check the execution.
 */


package com.multiThreading;

class myThread_1 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread-1 Started!!");
	}
}

class myThread_2 extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread-2 Started!!");
	}
}


public class Task_3 {
	
	public static void main(String[] args) {
		
		myThread_1 mt1 = new myThread_1();
		
		myThread_2 mt2 = new myThread_2();
		
		
		try {
			
			mt1.start();
			Thread.sleep(2000);
			mt2.start();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
		
	}	
	
}
