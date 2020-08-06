package com.opt.java.basics12;

class MyThreadB implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running..");
	}
	
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadB refMyThreadB=new MyThreadB();
		
		Thread refThread1=new Thread(refMyThreadB);
		Thread refThread2=new Thread(refMyThreadB);
		
		
		refThread1.start();
		refThread2.start();
		
		//Best coding practices we should call run()
		refThread1.run();
		refThread2.run();
		
	}

}
