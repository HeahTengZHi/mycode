package com.opt.java.basics15;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class MyLinkedList{
	
	void LinkedListOperation() {
		LinkedList<String> refLinkedList=new LinkedList<String>();
		refLinkedList.add("Heah");
		refLinkedList.add("Chen");
		refLinkedList.add("Sera");
		String element;
		int position,choice=0;
		
		Scanner sc=new Scanner(System.in);
		while(choice<4){
			System.out.println("1. Add an element: ");//insert
			System.out.println("2. Remove an element: ");//delete
			System.out.println("3. Change an element: ");//search
			System.out.println("4. Exit an element: ");//exit
			System.out.print("Enter your choice: ");
			int number=sc.nextInt();
			
			switch(number) {
			case 1:
				System.out.print("Enter an element: ");
				element=sc.next();
				System.out.print("At which position you want to add: ");
				position=sc.nextInt();
				refLinkedList.add(position-1,element);
				break;
			case 2:
				System.out.println("Enter position to remove: ");
				position=sc.nextInt();
				refLinkedList.remove(position-1);
				break;
			case 3:
				System.out.print("Enter position: ");
				position=sc.nextInt();
				System.out.print("Enter new element: ");
				element=sc.next();
				//set ==> change the element
				refLinkedList.set(position-1, element);
				break;
			default:
				break;
			}
			System.out.println("Stack contains: "+refLinkedList);
			
			//Iterator is an interface, we use for print the 
			Iterator refIterator=refLinkedList.iterator();
			while(refIterator.hasNext()) {
				System.out.println(refIterator.next());
			}
		}
	}
}

public class LinkedListDemo {

	public static void main(String[] args) {
		new MyLinkedList().LinkedListOperation();

	}

}
