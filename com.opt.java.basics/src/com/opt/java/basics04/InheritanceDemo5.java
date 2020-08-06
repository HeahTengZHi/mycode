package com.opt.java.basics04;

class Super{
	void showData() {
		System.out.println("Super : showData");
	}//end of showData
}//end of Super

class Sub extends Super{
	void showData() {
		System.out.println("Sub : showData");
	}//end of showData
	
	void display() {
		super.showData(); // call super class
		this.showData(); //call sub class
	}
}//end of Sub

public class InheritanceDemo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub refSub=new Sub();
		refSub.display();
	}
}
