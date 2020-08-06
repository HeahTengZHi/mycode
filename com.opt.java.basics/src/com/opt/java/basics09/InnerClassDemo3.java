package com.opt.java.basics09;

class OuterProduct{
	private int getProductID(int data) {
		class InnerProduct{
			private int getData(){
				System.out.println("Inside InnerProduct..");
				
				if(data<100) {
					return 50;
				}else {
					return 20;
				}
			}//end of getData
			
		}//end of InnerProduct
		//write your code
		InnerProduct inner=new InnerProduct();
		return inner.getData();
	}
	
	void takeInData(int num) {
		System.out.println(getProductID(num));
	}
	
}

public class InnerClassDemo3 {

	public static void main(String[] args) {
		OuterProduct outerClass=new OuterProduct();
		outerClass.takeInData(99);
		outerClass.takeInData(100);
	}

}
