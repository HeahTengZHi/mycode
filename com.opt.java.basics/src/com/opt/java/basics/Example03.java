  package com.opt.java.basics;

class Customer{
	int customerID=20;				//global variable
	String customerName="David";	//global variable
	
	void getData(int customerID,String customerName) { //local variables holds the data
		//this is to modify the data from same variable name
		this.customerID=customerID; 
		this.customerName=customerName;
	}//end getData
	
	void displayData() {
		System.out.println(customerID+" "+customerName);
	}//end displayData
}

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer refCustomer=new Customer();
		refCustomer.getData(100, "Alex"); //data 
		refCustomer.displayData();

	}

}
