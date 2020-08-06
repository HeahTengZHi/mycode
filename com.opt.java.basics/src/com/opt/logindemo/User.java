package com.opt.logindemo;

//Plain of java object / Entity class / Reusable class
public class User {
	public final static int MAX_VALUE=180;
	private int userID;
	private String userPassword;
	
	public int getUserID() {
		return userID;
	}
	public void setUseID(int userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
