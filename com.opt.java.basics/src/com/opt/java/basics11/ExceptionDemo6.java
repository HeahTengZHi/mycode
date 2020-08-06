package com.opt.java.basics11;

import java.io.IOException;

class Parent{
	void showData() throws ArithmeticException{ //throws and unchecked Exception
		System.out.println("Parent showData()");
	}
}

class Child extends Parent{
//	@Override
//	void showData() { //throws IOException (checked exception) compile time error
//		
//	}
	
	@Override
	void showData() throws ArrayIndexOutOfBoundsException { //Unchecked exception no compile time error
		System.out.println("Child showData()");
	}
	
	
//	@Override
//	void showData() throws Exception{ //will get compile time error because Exception is for Parent
//									 //class of ArithmenticException
//		System.out.println("Parent showData()");
//	}
}

public class ExceptionDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		try {
			System.out.println(n/=0);
		}catch(Exception e) {
			
		}
		
	}

}
