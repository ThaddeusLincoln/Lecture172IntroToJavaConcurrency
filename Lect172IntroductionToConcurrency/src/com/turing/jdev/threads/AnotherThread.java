package com.turing.jdev.threads;

public class AnotherThread extends Thread {

	@Override
	public void run() {
		
		System.out.println("Hello from " + currentThread().getName());
		
		// playing with the thread
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			// this line will be executed if another thread wakes this one
			System.out.println("Another therad woke me up");
		}
		
		System.out.println("3 seconds are passed and " + currentThread().getName() + "is awake again");
	}
	
	

	
	
}
