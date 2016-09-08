package com.turing.jdev.threads;

public class Main {
	
	public static void main(String[] args){

		// 1.
		System.out.println("Hello from the main thread");
		
		// 2.
		AnotherThread anotherThread = new AnotherThread();
		anotherThread.setName("==Another Thread==");
		anotherThread.start();
		
		// 3. java.lang.IllegalThreadStateException
		System.out.println("Hello AGAIN from the main thread");
		
		// 4. this will cause java.lang.IllegalThreadStateException
		//anotherThread.start();
		
		// 5. ANONYMOUS CLASS
		/*new Thread(){
			
			@Override
			public void run(){
				System.out.println("Hallo vom ANONYMOUS class!!");
			}
			
		}.start();*/
		
		// 7.1 using lambda expressions with threads
		new Thread(()-> System.out.println("Thread with Lamda Expression!")).start();
		
		// 7. using Runnable by passing it as a parameter to a Thread object
		Thread myRunnableThread = new Thread(new MyRunnable());
		myRunnableThread.start();
		
		// 8. using Runnable by using an ANONYMOUS class
		Thread myRunnableThread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Yo man, here I'm using an Anonymous Runnable!!, Cool, eh?!");
				
			 }
		});
		
		myRunnableThread2.start();
		
	}

}
