package com.opt.logindemo;

//DAO is a class=>Data Access Object
//In this class we write database connection and sql queries
public class UserDOA {
	
	boolean loginStatus;
	
	public boolean loginValidate(User refUser) {
		if(refUser.getUserID()==111 && refUser.getUserPassword().equals("optimum")) {
			loginStatus=true;
		}else {
			loginStatus=false;
		}
		
		return loginStatus;
	}//end of loginValidate
}// end of UserDAO
