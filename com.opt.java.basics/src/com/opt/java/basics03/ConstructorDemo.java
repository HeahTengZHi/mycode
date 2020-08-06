package com.opt.java.basics03;


class User{
	
	//constructor name and class name must be same
	User(){
		this(20);  
		System.out.println("I am inside default constructor..");
		
	}//end of User
	
	User(int data){
		this("Hello",100);
		System.out.println(data);
	}//end of User
	
	User(String name, int number){
		System.out.println(name+" "+number);
	}//end of User
}

public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new User();
		
	}

}
