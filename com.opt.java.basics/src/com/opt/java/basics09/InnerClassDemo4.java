package com.opt.java.basics09;

public class InnerClassDemo4 {
	
	public static void main(String[] args) {
		
		InnerClassDemo4 refClass=new InnerClassDemo4();
		Java refJava=refClass.new Java();
		refJava.callJava2();
		
		Python p=new Python();
		Python.callPython1();
		p.callPython2();
		
	}
	
	class Java{
		
		//can have static method because the class is inside public class InnerClassDemo4
//		static void callJava1() {
//			
//		}
		
		void callJava2() {
			System.out.println("I am inside Java ==> callJava2()");
		}
		
	}//end of Java
	
	static class Python{
		
		static void callPython1() {
			System.out.println("I am inside Python ==> callPython1()");
		}
		
		void callPython2() {
			System.out.println("I am inside Python ==> callPython2()");
		}
	}//end of Python
}
