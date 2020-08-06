package com.opt.java.basics03;

public class ProductDemo {

	public static void main(String[] args) {
		Product refProduct=new Product();
		refProduct.setUserData(100);
		//System.out.println(refProduct.showData());
		
		int tempData=refProduct.getUserData();
		System.out.println(tempData);
	}

}
