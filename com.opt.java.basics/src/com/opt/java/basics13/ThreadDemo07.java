package com.opt.java.basics13;

import java.util.Arrays;

class Producer extends Thread{
	StringBuffer refData;

	Producer(){
		refData=new StringBuffer();
	}

	@Override
	public void run() {
		synchronized(refData) {		//lock the memory (reference)
			for (int i = 0; i <=3; i++) {
				try {
					refData.append(i+" ");
					Thread.sleep(3000);
					System.out.println("Appending Data to StringBuffer");
					refData.notify(); 	//needs to notify
				}catch (Exception e){// nothing}
				}
			}
		}
	}
}

class Consumer extends Thread{
	Producer refProducer;

	Consumer(Producer refProducer){
		this.refProducer=refProducer;
	}

	@Override
	public void run() {
		synchronized(refProducer.refData) {
			try {
				System.out.println("Before wait..");
				refProducer.refData.wait(1000);
				System.out.println("I am inside Consumer..");
			}catch(Exception e) {

			}
			System.out.println(refProducer.refData);
		}
	}
}

public class ThreadDemo07 {

	public static void main (String[] args) {
		Producer refProducer=new Producer();
		Consumer refConsumer=new Consumer(refProducer);

		Thread refThread1=new Thread(refProducer);
		Thread refThread2=new Thread(refConsumer);

		refThread1.start();
		refThread2.start();
		
	}

}

