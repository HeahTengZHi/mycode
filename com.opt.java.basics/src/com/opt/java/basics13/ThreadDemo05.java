package com.opt.java.basics13;

class BookTicket extends Thread{
	Object trainRef,compRef;
	BookTicket(Object trainRef,Object compRef){
		this.trainRef=trainRef;
		this.compRef=compRef;
	}

	public void run() {
		//deadlock scenario compRef
		synchronized(trainRef) { //object level locking ==>Deadlock Scenario
			System.out.println("BookTicket Locked on Train Object..");

			try {
				Thread.sleep(5000);
			}catch(Exception e) {

			}
			System.out.println("BookTicket now waiting to lock on Compartment Object..");
			synchronized(compRef) { //
				System.out.println("BookTicket Locked on Compartment Object..");
			}
		}
	}
}

class CancelTicket extends Thread{
	Object trainRef,compRef;
	CancelTicket(Object trainRef,Object compRef){
		this.trainRef=trainRef;
		this.compRef=compRef;
	}

	public void run() {
		
		synchronized(trainRef) { // 
			System.out.println("CancelTicket Locked on Compartment Object..");

			try {
				Thread.sleep(5000);
			}catch(Exception e) {

			}
			System.out.println("CancelTicket now waiting to lock on Train Object..");
			synchronized(compRef) { //
				System.out.println("CancelTicket Locked on Train Object..");
			}
		}
	}
}

//According to best coding practice, developer should write synchronized block, not method.

public class ThreadDemo05 {

	public static void main(String[] args) {
		Object ref1=new Object();
		Object ref2=new Object();
		
		BookTicket refBookTicket=new BookTicket(ref1,ref2);
		CancelTicket refCancelTicket=new CancelTicket(ref1,ref2);
		
		Thread refThread1=new Thread(refBookTicket);
		Thread refThread2=new Thread(refCancelTicket);
		
		refThread1.start();
		refThread2.start();
	}

}
