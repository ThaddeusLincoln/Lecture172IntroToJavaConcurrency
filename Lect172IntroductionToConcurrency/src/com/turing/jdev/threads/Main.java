package com.turing.jdev.threads;

public class Main {
	
	public static void main(String[] args){

		// 1
		System.out.println("Hello from the main thread");
		
		// 2
		AnotherThread anotherThread = new AnotherThread();
		anotherThread.start();
		
		// 3 java.lang.IllegalThreadStateException
		System.out.println("Hello AGAIN from the main thread");
		
		// will cause 
		//anotherThread.start();
	}

}
