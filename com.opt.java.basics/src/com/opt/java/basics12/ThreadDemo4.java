package com.opt.java.basics12;

class MyThreadD extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i <=3; i++) {
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
				System.out.println("Exception Handled...");
			}
			System.out.println(i);
			System.out.println(currentThread().getName());
		}
	}
}

public class ThreadDemo4 {

	public static void main(String[] args) {
		MyThreadD refThread1=new MyThreadD();
		MyThreadD refThread2=new MyThreadD();
		MyThreadD refThread3=new MyThreadD();
		MyThreadD refThread4=new MyThreadD();
		
		refThread1.setName("Sharon");
		refThread2.setName("Hoi Yee");
		refThread3.setName("Laxman");
		refThread4.setName("Hassan");
		
		refThread1.start();
		refThread3.start();
		refThread2.start();
		refThread4.start();
		
		try {
			refThread2.join(); //how to join??
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
		
	}

}
