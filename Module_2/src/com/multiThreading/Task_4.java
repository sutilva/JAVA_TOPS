/*
 * W.A.J.P to start the same Thread twice by calling start () method twice. 
 * Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
 */



package com.multiThreading;

class TestThreadTwice1 extends Thread {
	
	@Override
	public void run() {
		
		System.out.println("Thread Started!!");
	}
}

public class Task_4 {
	
	public static void main(String[] args) {
		
		TestThreadTwice1 t1 = new TestThreadTwice1();
		
		try {
			
			t1.start();
			t1.start();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
