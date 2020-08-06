package com.opt.java.basics09;

//Anonymous Inner Class
abstract class Customer{
	
	abstract void showCustomerData();
}

interface Product{
	void showProductData();
}

//Override showProductData() & showCustomerData() without extends and implements
//in My class

class MyClass{
	//how to do it?
	Customer refCustomer=new Customer() { //It is an anonymous inner class not object
		void showCustomerData() {
			System.out.println("Overriding customerdata");
		}
	};
	
	
	Product refProduct=new Product() { //It is an anonymous inner class not object
		public void showProductData() {
			System.out.println("Overriding productdata");
		}
	};
}

public class InnerClassDemo5 {

	public static void main(String[] args) {
		MyClass refMyClass=new MyClass();
		refMyClass.refCustomer.showCustomerData();
		refMyClass.refProduct.showProductData();

	}

}
