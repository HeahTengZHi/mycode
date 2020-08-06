package com.opt.java.basics;

import java.io.PrintStream;

public class Example01 {

	//global variables
	static int id=10; // static variable
	int id2=20;//non-static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//E.g1
		//Step 1
		//call a static variable
		System.out.println("static variable: "+Example01.id);
		//Step 2
		// call a non-static variable(instance) variable [to call a non-static variable you will need to create an object]
		
		//we need to create object of this Example01 class, since main is static
		//static method can't call non-static method/variable directly
		//Note: if a method is static, need to create an object to call a variable that is not static
		
		//create an object of Example01
		// the object will go into heap area, create ref, variable, method, it will go to stack
		// however, we do have some limitation in heap and RAM therefore, we need to clear sometimes..
		Example01 ref = new Example01();
		System.out.println(ref.id2);
		// or
		PrintStream ps = System.out;
		ps.println(new Example01().id2);
		// can we call id1 and id2 variable?
		
	} //main() method

}
