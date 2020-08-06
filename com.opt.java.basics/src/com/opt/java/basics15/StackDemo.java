package com.opt.java.basics15;

import java.util.Scanner;
import java.util.Stack;

class MyStackClass{
	
	void stackOperation() {
		Stack<Integer> refStack=new Stack<Integer>();
		int choice=0;
		int position,element;
		
		Scanner sc=new Scanner(System.in);
		while(choice<4){
			System.out.println("1. Push an element: ");//insert
			System.out.println("2. Pop an element: ");//delete
			System.out.println("3. Peep an element: ");//search
			System.out.println("4. Exit an element: ");//exit
			
			int number=sc.nextInt();
			
			switch(number) {
			case 1:
				System.out.print("Enter an element: ");
				element=sc.nextInt();
				refStack.push(element);
				break;
			case 2:
				Integer refInteger=refStack.pop();
				System.out.println("Poped: "+refInteger);
				break;
			case 3:
				System.out.print("Search an element(Search): ");
				element=sc.nextInt();
				position=refStack.search(element);
				if(position==-1) {
					System.out.println("Element Not Found..");
				}else {
					System.out.println("Position: "+position);
				}
			default:
				break;
			}
			System.out.println("Stack contains: "+refStack);
		}
	}
	
	
}

public class StackDemo {

	public static void main(String[] args) {
		new MyStackClass().stackOperation();

	}

}
