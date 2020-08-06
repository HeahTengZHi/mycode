package com.opt.java.basics07;

import java.util.*;

public class PersonArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("How many record you want to insert? ");
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		
		Person p[]=new Person[number];
		Person p1=new Person("helo",123);
		for(int i=0; i<p.length;i++) {
			System.out.println("Enter your name :");
			String name=sc.next();
			System.out.println("Enter you ID");
			int id =sc.nextInt();
			
			p[i]=new Person(name,id); // we are adding or getting from User
		}
		
		for(Person person:p) {
			System.out.println(person); //we are printing all the person
		}
		
		
	}

}
