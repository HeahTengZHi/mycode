package com.opt.java.basics04;


class User1{
	private String email;
	private String name;
	
	User1(String email,String name){
		this.email=email;
		this.name=name;
	}
	
	User1(String email){
		this.email=email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class Customer extends User1{
	private double balance;
	private String account_status;
	Customer(String email,double balance,String account_status) {
		super(email);
		this.balance=balance;
		this.account_status=account_status;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccount_status() {
		return account_status;
	}
	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	
	
}


public class InheritanceClassExample01 {
	
	public static void main(String[] args) {
		
		User1 u=new User1("email","name");
		Customer c=(Customer) u;
		
		System.out.println(c.getEmail());
	}
}
