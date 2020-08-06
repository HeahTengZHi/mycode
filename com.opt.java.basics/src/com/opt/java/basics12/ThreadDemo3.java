package com.opt.java.basics12;

class MyThreadC implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is Running.. ");
	}
	
	
}

public class ThreadDemo3 {

	public static void main(String[] args) {
		Runnable refRunnable1=new Runnable() {
			@Override
			public void run() {
				System.out.println("Task One Running..");
			}
			
		};
		
		Runnable refRunnable2=new Runnable() {
			@Override
			public void run() {
				System.out.println("Task Two Running..");
			}
			
		};
		
		Thread refThread1=new Thread(refRunnable1);
		Thread refThread2=new Thread(refRunnable1);
		
		refRunnable1.run();
		refRunnable2.run();
		
		//refRunnable1.start(); why we are getting error?
		//refRunnable2.start();
		
		//Best coding practices we should call run()
	}

}
