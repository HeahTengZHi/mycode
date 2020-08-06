package com.opt.java.basics04;

class Product{
	Product(int productID){
		System.out.println("I am in Product.." +productID);
	}// end of Product
}// end of Product

class Laptop extends Product{
	Laptop(String laptopdata, int productID){
		super(productID);
		System.out.println("I am in Laptop.."+laptopdata);
	}// end of Laptop
	
	String test() {
		return "dsadsa";
	}
}// end of Laptop

class Lenovo extends Laptop{
	Lenovo(String data,int id){
		super(data,id);	//Call parent class constructor by using super keyword
		System.out.println("I am in Lenovo.."+data+" "+id);
	}// end of Lenovo
	
	String test() {
		return "test1"+super.test();
	}
}// end of Lenovo
public class InheritanceDem04 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Lenovo n=new Lenovo("Yoga Model",123);
		System.out.println(n.test()); 
	}

}
