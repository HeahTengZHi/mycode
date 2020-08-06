package com.opt.java.basics04;

class Oracle{
	void getDriver(){
		System.out.println("Oracle Driver");
	}//end of getDriver
}//end of Oracle

class Microsoft{
	void getDriver(){
		System.out.println("Microsoft Driver");
	}//end of getDriver
}//end of Microsoft

//Call seperately without extends
class MyApplication{
	Oracle refOracle=new Oracle();
	Microsoft refMicrosoft=new Microsoft();
	
	void showMyApplication(){
		refOracle.getDriver();
		refMicrosoft.getDriver();
	}
	
	
}//end of MyApplication
public class InheritanceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyApplication().showMyApplication();
	}

}
