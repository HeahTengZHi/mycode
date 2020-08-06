package com.opt.java.basics11;

class Customer extends Exception{
	
	void myLogic() {
		try {
			checkLogin(20);
		} catch (Customer e) {
			System.out.println("Exception..");
		}
	}
	
	void checkLogin (int age) throws Customer{
		if(age>18) { //if its true call welcomeDashBoard()
			Customer refCustomer=new Customer();
			welcomeDashBoard();
			//throw refCustomer;
			
		}else {
			homePage();
		}
	}
	
	void homePage() {
		System.out.println("Return Home Page..");
	}
	
	void welcomeDashBoard() {
		System.out.println("Welcome to DashBoard");
	}
	
}

public class ExceptionDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Customer().myLogic();
	}

}
