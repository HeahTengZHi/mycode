package com.opt.java.basics;
import java.io.PrintStream;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = System.out;
		ps.println("hello world..");
		//System.out.println("hi");
		
		
		new Example04().displayMethodPublic();
		new Example04().displayMethodProtected();
		new Example04().displayMethodDefault();
		
		System.out.println(new Example04().str1);
		System.out.println(new Example04().str2);
		System.out.println(new Example04().str3);
	}// end of main method

}
