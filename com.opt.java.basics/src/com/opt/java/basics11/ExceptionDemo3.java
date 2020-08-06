package com.opt.java.basics11;

import java.io.IOException;

class MyClass{
	
	void myMethod1() throws IOException{//checked exception
		throw new IOException();		//User Defined exception
	}
	
	void myMethod2() throws IOException { //compiled time exception
		myMethod1();
	}
	
	void myMethod3() {
		try {
			myMethod2();
		}catch (IOException e) {
			System.out.println("Exception Handled1..");
		}
	}
}

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new MyClass().myMethod2();
		} catch (IOException e) {
			System.out.println("Exception Handled2..");
		}
		
		//No need try and Catch
		new MyClass().myMethod3();
	}

}
