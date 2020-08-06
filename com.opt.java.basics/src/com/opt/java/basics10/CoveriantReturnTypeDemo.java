package com.opt.java.basics10;

class Loan1{
	
	private Loan1 refLoan1; //refLoan1 is reference if class Loan1
	
	Loan1 showLoan1(Loan1 refLoan1) {
		refLoan1= new Loan1();
		return refLoan1;
	}
}

class CarLoan extends Loan1{
	
	private CarLoan carLoan; //carLoan1 is reference if class CarLoan
	
	@Override
	Loan1 showLoan1(Loan1 carLoan) {
		carLoan=new CarLoan();
		return carLoan;
	}
}
public class CoveriantReturnTypeDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
