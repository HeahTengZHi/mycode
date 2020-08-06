package com.opt.java.basics02;


// For LoginAuthentication.java
public class User {
	int userID;
	//String is a class not data type
	String userPassword;
	
	void getData(int userID,String userPassword){
		this.userID=userID;
		this.userPassword=userPassword;
	}//end of getData
	
	
	void loginValidate(){
		//set some id and password
		int id=123;
		String password="123abc";
		//Check login ID and Password
		//String is a class in java so we have to use .equals to check the value
		//If yes then "Welcome userID, else show invalid ID or Password"
		if(userID==id && userPassword.equals(password)) {
			System.out.println("Welcome "+userID);
		}else {
			System.out.println("Invalid ID or Password");
		}
		System.out.println(userID +" "+id+" "+userPassword+" "+password);
		
		
		
	}//end of loginValidate
}//end of User Class
