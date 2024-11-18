/*
 * W.A.J. P to create one thread by extending Thread class in another Class.
 */


package com.multiThreading;

class myThread1 extends Thread {
	
	@Override
	public void run() {

		System.out.println("Thread Started!!");
	}
}

public class Task_2 {

	public static void main(String[] args) {
		
		myThread1 mt = new myThread1();		
		
		mt.start();
	}
}
