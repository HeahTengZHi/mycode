package com.opt.java.basics02;
import java.util.Scanner;

public class LoginAuthentication {

	public static void main(String[] args) {
		//Request for ID and Password
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter userID: ");
		int userID=sc.nextInt();
		System.out.println("Please enter userPassword: ");
		String userPassword=sc.next();
		//call getData() method and pass argument ID and Password
		User user=new User();
		user.getData(userID, userPassword);
		user.loginValidate();
	
		
	}

}
