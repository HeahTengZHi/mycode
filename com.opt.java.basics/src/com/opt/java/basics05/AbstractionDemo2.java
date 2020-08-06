package com.opt.java.basics05;

abstract class Product{
	void PrintProductFunction() {
		System.out.println("Product Functions");
	}
	abstract void productDetails();
}//end of Product

abstract class Laptop extends Product{
	void PrintLaptopFunction() {
		System.out.println("Laptop Functions");
	}
	abstract void laptopDetails();
}//end of Laptop

class MyClass extends Laptop{

	@Override
	void laptopDetails() {
		// TODO Auto-generated method stub
		PrintLaptopFunction();
	}

	@Override
	void productDetails() {
		// TODO Auto-generated method stub
		PrintProductFunction();
	}
	
}//end of MyClass

public class AbstractionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClass().laptopDetails();
		new MyClass().productDetails();
	}

}
