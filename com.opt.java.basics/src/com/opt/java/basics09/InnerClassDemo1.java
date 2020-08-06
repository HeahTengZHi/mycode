package com.opt.java.basics09;

//What is InnerClass?
//Class within a class

//Why we need it?
//For more protection

//Where to use it?
//Security

class OuterA{
	
	class InnerB{
		
	private	void showInnerB() {
			System.out.println("I am inside showInnerB");
		}
	}//end of InnerB;
	
	InnerB refInnerB=new InnerB(); //we are able to call inner class even it is private
	
	void showB() {
		refInnerB.showInnerB();
	}
	
}//end of InnerA
public class InnerClassDemo1 {

	public static void main(String[] args) {
		OuterA refOuterA=new OuterA();
		refOuterA.showB();
			
	}

}
