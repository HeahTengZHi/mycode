package com.opt.java.basics09;

class OuterBank{
	private int num1=20;
	void showOuterBank() {
		final int num=10;
		class InnerBank{
			void showInnerBank() {
				System.out.println("I am inside showInnerBank.."+num+" "+num1);
			}//end of showInnerbank
		}//end of InnerBank Class
		
		//Call InnerClass method
		InnerBank inner=new InnerBank();
		inner.showInnerBank();
		
	}//end of showOuterBank
}//end of OuterBank Class


public class InnerClassDemo2 {

	public static void main(String[] args) {
		new OuterBank().showOuterBank();

	}

}
