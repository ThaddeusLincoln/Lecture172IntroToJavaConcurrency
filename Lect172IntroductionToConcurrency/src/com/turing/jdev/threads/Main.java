package com.turing.jdev.threads;

public class Main {
	
	public static void main(String[] args){

		// 1.
		System.out.println("hello from the main thread");
		
		// 2.
		AnotherThread anotherThread = new AnotherThread();
		anotherThread.setName("==Another Thread==");
		anotherThread.start();
		
		// 4. this will cause java.lang.IllegalThreadStateException
		//anotherThread.start();
		
		// 5. ANONYMOUS CLASS
		new Thread(){
			
			@Override
			public void run(){
				System.out.println("Ciao sona una ANONYMOUS class!!");
			}
			
		}.start();
		
		// 7. using Runnable by passing it as a parameter to a Thread object
		Thread myRunnableThread = new Thread(new MyRunnable()) {
			@Override
			public void run(){
				System.out.println("Ciao, sono una class anonima chi implementa run()");
				
				try{
					anotherThread.join(10000);	// this will do its work after anotherThread is done, or timesOut
					System.out.println("Another Thread ha finito, o ha fatto timeout, allora sto correndo di nuovo");
				}catch(InterruptedException e){
					System.out.println("Non ho potuto finire la mia task");
				}
			}
		};
		myRunnableThread.start();
		
		// anotherThread.interrupt();
		
		System.out.println("hello again from main thread");
		
	}

}
