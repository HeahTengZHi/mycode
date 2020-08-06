package com.opt.java.basics05;

interface Company{
	int companyID=12121;
}//end of Company

class Optimum implements Company{
	
	void details() {
		System.out.println(companyID);
	}
}
public class AbstractionDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optimum refOptimum=new Optimum();
		refOptimum.details();
	}

}
