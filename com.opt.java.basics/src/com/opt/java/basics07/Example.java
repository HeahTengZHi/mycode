package com.opt.java.basics07;

class Example1{
	
	//The 3 dots can add more parameters 
	void showData(Object... arg) {
		for(Object temp:arg) {
			System.out.println(temp);
		}
	}
}

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 refExample1=new Example1();
		String[] user=new String[] {"Hello","World","Covid-19","is here!!"};
		refExample1.showData(user);
		refExample1.showData("dsa",22,'1');
		
	}

} 
