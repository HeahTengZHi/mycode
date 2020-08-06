package com.opt.java.basics13;

//Given:
//There are only specified amount of Tickets allows customers to purchase.
//The tickets will be sold in first-come-first-served order.

//When:
//The customers want to purchase tickets.

//Then:
//Customer can only purchase available tickets in the system.

class ReserveTicket implements Runnable{
	int availableTicket;
	int wantedTicket;
	
	public ReserveTicket(int availableTicket) {
		this.availableTicket=availableTicket;
	}

	@Override
	public synchronized void run() { //
		String name=Thread.currentThread().getName();
		//Based on the requirement
		switch (name) {
		case "Sera":
			//Sera needs 1
			wantedTicket=1;
			break;
		case "Nanthini":
			//Nanthini needs 3
			wantedTicket=3;
			break;
		case "Kenny":
			//Kenny needs 1
			wantedTicket=1;
			break;
		case "Zaf":
			//Zaf needs 4
			wantedTicket=4;
			break;
		case "KK":
			//KK needs 2
			wantedTicket=2;
			break;
		default:
			break;
		}
		
		//If available ticket is greater than wantedTicket
		if(availableTicket>wantedTicket) {
			//then minus it
			this.availableTicket-=wantedTicket;
		}else {
			//else will only take availableTicket and set it 0
			wantedTicket=this.availableTicket;
			this.availableTicket=0;
		}
		System.out.println(wantedTicket+" Reserved for "+name);
	}
}

public class ThreadDemo06 {

	public static void main(String[] args) {
		ReserveTicket refReserveTicket=new ReserveTicket(5);
		Thread refThread1=new Thread(refReserveTicket);
		Thread refThread2=new Thread(refReserveTicket);
		Thread refThread3=new Thread(refReserveTicket);
		Thread refThread4=new Thread(refReserveTicket);
		Thread refThread5=new Thread(refReserveTicket);
		
		refThread1.setName("Sera");		//4		real life scenario =>sera needs 1
		refThread2.setName("Nanthini"); //4		real life scenario =>Nanthini needs 3
		refThread3.setName("Kenny");	//4		real life scenario =>Kenny needs 1
		refThread4.setName("KK");		//4		real life scenario =>KK needs 2
		refThread5.setName("Zaf");		//4		real life scenario =>Zaf needs 4
		
		refThread1.start();
		refThread2.start();
		refThread3.start();
		refThread4.start();
		refThread5.start();
		
	}

}
