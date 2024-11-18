/*
 * W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set Daemon () method of 
 * Thread class and check whether the thread is set daemon or not by using is Daemon () method. 
 * TestDaemonThread2 t1=new TestDaemonThread2(); TestDaemonThread2 t2=new TestDaemonThread2(); 
 * t1.start(); t1.setDaemon(true);//will throw exception here t2.start();
 */



package com.multiThreading;

class TestDaemonThread2 extends Thread {
	
	@Override
	public void run() {
		System.out.println("Thread Started");
	}
	
}


public class Task_5 {
	
	public static void main(String[] args) {
		
		TestDaemonThread2 t1 = new TestDaemonThread2();
		TestDaemonThread2 t2 = new TestDaemonThread2();		
		
		try {
			
			t1.start();		
			t1.setDaemon(true);			
			t2.start();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
 	}
	
}
