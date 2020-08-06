package com.opt.java.basics05;

abstract class  MyClass1{
	abstract void myMethod();
}//end of MyClass1


interface OOP{	//fully abstract class [abstract keyword is optional]
	 void features(); //abstract method [abstract keyword is optional]
	
}//end of OOP

interface OOP2 extends OOP{	//fully abstract class [abstract keyword is optional]
	 void features(); //abstract method [abstract keyword is optional]
	
}//end of OOP

class Java extends MyClass1 implements OOP,OOP2{
	@Override
	public void features() {
		
	}
	
	@Override
	void myMethod() {
		// TODO Auto-generated method stub
		
	}
}//end of Java

class Python{
	
}//end of Python

public class AbstractionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
