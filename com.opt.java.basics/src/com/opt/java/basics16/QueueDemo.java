package com.opt.java.basics16;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

//What is Queue?
//In Java Queue is an interface of Collection framework
//FIFO (first in first out)

//add(), offer(), remove(), poll(), element(), and peek()

//delete can take place only one and ==>front
//insert can take place only the other hand ==> rear

// (delete)  front<=============================< insert (add)

//Dequeue : add or remove either front/insert/in the middle



public class QueueDemo {

	public static void main(String[] args) {

//		Queue refQueue=new LinkedList();
		Queue refQueue=new PriorityQueue();
//		BlockingDeque refQueue=new LinkedBlockingDeque();
		
		refQueue.add("Python");
		refQueue.add("React");
		refQueue.add("Kotlin");
		refQueue.add("Java");
		
		System.out.println(refQueue);
		System.out.println("remove element : "+ refQueue.remove());
		//Remove front
		System.out.println(refQueue);
		
		System.out.println(refQueue.poll());
		System.out.println(refQueue);
		System.out.println(refQueue.peek());
		System.out.println(refQueue);
	}

}
