/*
 * W.A.J. P to create one thread by implementing Runnable interface in Class.
 */



package com.multiThreading;

class MyThread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("run() method is implemented");
		
	}
}

public class Task_1 {
	
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		
		Thread thread = new Thread(myThread);
		
		thread.start();
	}

}
