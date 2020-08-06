package com.opt.java.basics12;

class MyThreadA extends Thread{
	
	@Override //Inside Runnable Interface
	public void run() {
		System.out.println("Thread is Running.."+getName());
	}
	
	public void run1() {
		System.out.println("Thread is Running..");
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadA refMyThreadA=new MyThreadA();
		Thread refThread=new Thread(refMyThreadA);
		refMyThreadA.setName("Laxman");
		refMyThreadA.start();
		refMyThreadA.run();
		
		//refThread only can call override method from MyThreadA
		//refThread cant use the method without overriding in its own method
		refThread.setName("Chen");
		refThread.start(); //Best coding practices
		refThread.run();	//Best coding practices
	}

}
