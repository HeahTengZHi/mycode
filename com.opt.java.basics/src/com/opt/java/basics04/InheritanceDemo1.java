package com.opt.java.basics04;

class Bank{
	void showBankData(){
		System.out.println("I am in show bank data");
	}
	
}//end of Bank

class DigitalBank extends Bank{
	void showDigitalBankData(){
		System.out.println("I am in show digital bank data");
	}
}//end of DigitalBank

class DBS extends DigitalBank{
	void showDBSData(){
		System.out.println("I am in show DBS data");
	}
}//end of DBS

class Payla extends DBS{
	void showPaylaData(){
		System.out.println("I am in show Payla data");
	}
}//end of Payla

//Extends Payla can access other classes
class MyClass extends Payla{
	void myData() {
		//Payla
		showPaylaData();
		//DBS
		showDBSData();
		//DigitalBank
		showDigitalBankData();
		//Bank
		showBankData();
	}
}//end of myclass

public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass refMyClass=new MyClass();
		refMyClass.myData();
	}

}
