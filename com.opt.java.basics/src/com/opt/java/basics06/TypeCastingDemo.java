package com.opt.java.basics06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Type Casting=> Conversion of one data type of another

//In Java, we have 8 primitive data types
//Wrapper class: Byte, Short, Character, Integer, Float, Long, Double and Boolean
//Primitive data type: byte, short, char, int, float, long, double and boolean
//String is consider as class in Java

//What is Object?
//Object is a super class of all the classes in Java

//3 diffrent types of casting
// 1)implicit and explicit casting
// 2)Upcasting and downcasting
// 3)Autoboxing and unboxing

//implicit and explicit casting example

class Example1{
	void showExample() {
		int number1=20;
		long number2=number1;	//implicit (less memory to high memory), done by JVM
		System.out.println(number2);
		
		double number3=20.69;
		float number4=(float) number3;	//explicit (high to less memory), done by Developer
		System.out.println(number4);
	}//end of showExample
}//end of Example1

//Upcasting and downcasting example

class Example2{
	void showExample() {
		String name1="Hello";
		Object name2=name1;			// upcasting (child to parent), done by JVM
		System.out.println(name2);
		
		Object name3="Shakti";
		String name4=(String) name3; // downcasting (parent to child), done by Developer
		System.out.println(name4);
	}//end of showExample
}//end of Example2

//Autoboxing and unboxing

class Example3{
	
	void showExample() throws IOException {
		//Ctrl+ Shift+ o to import error classes
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter you name");
		//Find String
		String name= br.readLine();
		System.out.println(name);
		
		//Find Integer
		int age=Integer.parseInt(br.readLine());
		System.out.println(age);
	}
}

public class TypeCastingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Example1().showExample();
		new Example2().showExample();
		new Example3().showExample();
	}

}
