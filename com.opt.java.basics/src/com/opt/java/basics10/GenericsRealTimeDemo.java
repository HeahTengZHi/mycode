package com.opt.java.basics10;


import java.util.ArrayList;

class Customer{
	
	@Override
	public String toString() {
		return "Return toString in Customer";
	}
	
}
public class GenericsRealTimeDemo {
	
	
	public static void main(String[] args) {
		
		//Object can be represent stored in many different primitive and wrapper class such as Integer,Character
		ArrayList<Object> obj=new ArrayList<Object>();
		
		Integer a=0;
		obj.add(a);
		obj.add("Data");
		
		int number=100;
		obj.add(number);
		
		Customer refCustomer=new Customer();
		obj.add(refCustomer);
		
		for(Object o:obj) {
			System.out.println(o);
		}
	}

}
