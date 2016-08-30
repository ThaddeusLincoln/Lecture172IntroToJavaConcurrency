package com.turing.jdev.threads;

public class Main {
	
	public static void main(String[] args){

		// 1.
		System.out.println("Hello from the main thread");
		
		// 2.
		AnotherThread anotherThread = new AnotherThread();
		anotherThread.start();
		
		// 3. java.lang.IllegalThreadStateException
		System.out.println("Hello AGAIN from the main thread");
		
		// 4. this will cause java.lang.IllegalThreadStateException
		//anotherThread.start();
		
		// 5. ANONYMOUS CLASS
		new Thread(){
			
			@Override
			public void run(){
				System.out.println("Hallo vom ANONYMOUS class!!");
			}
			
		}.start();
		
		// 7.
		Thread myRunnableThread = new Thread(new MyRunnable());
		myRunnableThread.start();
	}

}
