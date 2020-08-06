package com.opt.java.basics11;

//Throwable class
//Exception and Error
//Exception => Checked (compile time) and Unchecked (Runtime)
//Error => Stack Overflow

//What is exception?
//JVM performs the exception
//stack trace

class Person{
	void showPerson() {
		
	}
}
public class ExceptionDemo1 {

	public static void main(String[] args) {
		Person refPerson=null;
		try {
			System.out.println("Open File..");
			refPerson.showPerson();
		}catch (Exception e) {
			System.out.println("Need to initialize Person class");
		}finally {
			//Will execute in both the class => if we have exception or not
			System.out.println("Final");
		}

	}

}
