package com.opt.java.basics19;

class MyClass{
	{System.out.println("I am inside My Class");}
	
}


public class StaticBlockDemo {
	
	StaticBlockDemo(){
		System.out.println("I am inside constructor");
	}
	
	{System.out.println("I am inside non-static block");}
	
	static{
		//if class the class Will print out {System.out.println("I am inside non-static block");} 
		new MyClass();
		System.out.println("I am inside static block");
	}
	
	void myMethod(){
		System.out.println("I am inside method");
	}
	
	
	public static void main(String[] args) {
		new StaticBlockDemo().myMethod();

	}

}
