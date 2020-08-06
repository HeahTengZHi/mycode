package com.opt.java.basics09;

// If we make parent class Parent then we cant extends
final class Bank{
	
}//end of bank

class Parent{
	
	final void showData() {
		System.out.println("I am in Parent ==> showData()");
	}
}//end of Parent

class Child extends Parent{
	//Cant override final method
//	void showData() {
//		System.out.println("I am in Parent ==> showData()");
//	}
	
}

public class FinalDemo {
	//final variable value cant be changed
	final String name="kenny";
	
//	void showName() {
//		name="kenny";
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
