package com.opt.java.basics11;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		try {
			int number[]= {10,20,30};
			String s=null;
			s.charAt(0);
			
			number[90]=500;
			System.out.println(number[90]);
			
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(NullPointerException e) {
			System.out.println("NullPointerException");
		}
	}
}


