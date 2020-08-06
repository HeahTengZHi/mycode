package com.opt.java.basics10;

// Rule of Varargs
// there can be only one variable argument (varargs) in the method
//and varargs must be the last argument

public class VarArgsDemo1 {
	//More than 1 arguments
	public static void test1(int data1,String...data2) {
		for(String temp:data2) {
			System.out.println(temp);
		}
	}
	
	//Error
//	public static void test2(int... data1, int... data2) {
//		
//	}
	
	public static void test3(int data[],int data2[]) {
		//get Array
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1(10,"value1","value2","value-n");
		
		String number[]= {"20","30","50"};
		test1(50,number);
	}

}
