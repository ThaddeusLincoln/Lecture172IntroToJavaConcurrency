package com.turing.jdev.threads;

public class Main {
	
	public static void main(String[] args){
		System.out.println("Hello from the main thread");
		
		AnotherThread anotherThread = new AnotherThread();
		anotherThread.start();
	}

}
