package com.opt.java.basics04;


//Polymorphism overriding

//Different class (same method name) and (same parameters)
class Language{
	//
	Language showData() {
		Language ref=new Language();
		return ref;
	}
}//end of Language

class Java extends Language{
	  
	@Override
	Java showData() {
		Java ref=new Java();
		return ref;
	}
}//end of Java

public class MethodOverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java refJava=new Java();
		refJava.showData();
		
	}

}
