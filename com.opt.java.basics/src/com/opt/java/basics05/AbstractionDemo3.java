package com.opt.java.basics05;

abstract class Oracle{
	void showDriver() {
		System.out.println("Show Oracle Driver");
	}
	abstract void getDriverOracle();
}// end of Oracle

abstract class Microsoft{
	void showDriver() {
		System.out.println("Show Microsoft Driver");
	}
	abstract void getDriverMicrosoft();
}// end of Microsoft

class MyApp{
	//We need both methods to implement
	//getDriverOracle() and getDriverMicrosoft()
	//how can it be possible??
	Oracle refOracle=new Oracle() {

		@Override
		void getDriverOracle() {
			showDriver();
			System.out.println("Im Oracle..");
		}
		
	};
	
	Microsoft refMicrosoft=new Microsoft() {
		@Override
		void getDriverMicrosoft() {
			showDriver();
			System.out.println("Im Microsoft..");
		}
	};
	
}

public class AbstractionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		MyApp ma=new MyApp();
		ma.refOracle.getDriverOracle();
		System.out.println();
		ma.refOracle.showDriver();
		System.out.println();
		ma.refMicrosoft.getDriverMicrosoft();
		System.out.println();
		ma.refMicrosoft.showDriver();
		System.out.println();
	}

}
