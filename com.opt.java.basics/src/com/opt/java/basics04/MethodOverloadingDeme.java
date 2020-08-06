package com.opt.java.basics04;
import java.util.Scanner;

import com.opt.java.basics04.User;
//Polymorphism overloading 
class PopoutBlocker{
	private User user;
	//All the method same name
	void promtOutDetail() {
		System.out.println("Please provide your email, we will send you the verify code");
	}
	
	//All the method same name
	void promtOutDetail(String ID,String Password) {
		user=new User();
		user.setID("S111");
		user.setPassword("password");
		if(user.getID().equals(ID)&& user.getPassword().equals(Password)) {
			System.out.println("Welcome "+user.getID());
		}else if(!user.getID().equals(ID)){
			System.out.println("ID doesn't exist in database");
		}else {
			System.out.println("Invalid Password");
		}
	}
	//All the method same name
	void promtOutDetail(String email) {
		char a='@';
		if(email.indexOf(a)<0) {
			System.out.println("Invalid email");
		}else {
			System.out.println("Verity code sent");
		}
	}
	
}//end of Samsung

public class MethodOverloadingDeme {

	public static void main(String[] args) {
		PopoutBlocker promt=new PopoutBlocker();
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter userID: ");
		String userID=sc.next();
		System.out.println("Please enter userPassword: ");
		String userPassword=sc.next();
		
		//call getData() method and pass argument ID and Password
		
		if(userID.equals("f")|| userPassword.equals("f")) {
			promt.promtOutDetail();
			String email=sc.next();
			promt.promtOutDetail(email);
		}else{
			promt.promtOutDetail(userID,userPassword);
		}
		
	}

}
