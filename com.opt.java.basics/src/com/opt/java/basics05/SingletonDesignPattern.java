package com.opt.java.basics05;

class Driver{
	private static Driver refDriver=null;
	
	private Driver() {
		System.out.println("calling driver"); //prints the statement
	}
	
	public static Driver getDriver() {
		if(refDriver==null) {
			refDriver=new Driver(); //we create an object of Driver class, calls line 6
		}
		return refDriver;
	}
}

public class SingletonDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver.getDriver(); //line 10
		Driver.getDriver(); //line 10
		Driver.getDriver();
	}

}
