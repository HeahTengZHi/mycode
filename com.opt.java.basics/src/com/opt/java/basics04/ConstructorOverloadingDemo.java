package com.opt.java.basics04;

class HP{
	
	int number;
	HP(){
		number=30;
		System.out.println(number);
	}
	
	HP(int price){
		
	}

	HP(String model,int price){
	
	}
}

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HP();
	}

}
