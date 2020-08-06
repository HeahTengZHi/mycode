package com.opt.logindemo;

public class UserServices {
	private UserDOA refUserDAO;
	
	boolean getloginValidate(User refUser) {
		refUserDAO=new UserDOA();
		return refUserDAO.loginValidate(refUser);
	}
}
