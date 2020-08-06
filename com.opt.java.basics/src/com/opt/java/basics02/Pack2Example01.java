package com.opt.java.basics02;

//Import Example04 to access protected modifier
import com.opt.java.basics.Example04;

public class Pack2Example01 extends Example04{
	
	//Call Protected modifier from Example04
	void diplsay() {
		displayMethodProtected();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Call from Example04()
		new Example04().displayMethodPublic();
		//Call from Pack2Example01
		new Pack2Example01().displayMethodProtected();
		//Call from Pack2Example01 method
		new Pack2Example01().diplsay();
		
		Example04 e=new Example04();
		Pack2Example01 p=new Pack2Example01();

		//Print from Example04()
		System.out.println(new Example04().str1);
		//Print from Example04()
		System.out.println(new Pack2Example01().str2);
	}

}
