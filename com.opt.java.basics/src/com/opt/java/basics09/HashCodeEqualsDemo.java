package com.opt.java.basics09;

public class HashCodeEqualsDemo {
	
	static void scenario1() {
		int number1=30;
		int number2=30;
		
		if(number1==number2) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}// end of scenario1
	
	static void scenario2() {
		String name1="Hassan";
		String name2="Hassan";
		
		if(name1==name2) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}// end of scenario2
	
	static void scenario3() {
		String name1=new String("John");
		String name2=new String("John");
		
		if(name1==name2) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}// end of scenario3
	
	static void scenario4() {
		Person refPerson1=new Person("Hassan");
		Person refPerson2=new Person("Hassan");
		
		if(refPerson1==refPerson2) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}// end of scenario4
	
	static void scenario5() {
		Person refPerson1=new Person("Hassan");
		Person refPerson2=new Person("Hassan");
		//Since we have override hashCode() method inside Person Class,
		//pRef1 and pRef2 both the reference are pointing to the same memory address
		//.equals() method only checks the value if both references are pointing to the same memory address
		//hashCode() can reduce the heap memory and make the Java program run faster
		
		if(refPerson1.equals(refPerson2)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}// end of scenario5
	
	static void scenario6() {
		String str1=new String("Micah");
		String str2=new String("Micah");
		
		//For String class already override hashCode() and equals()
		if(str1.equals(str2)) {
			System.out.println("same");
		}else {
			System.out.println("different");
		}
	}
	public static void main(String[] args) {
		scenario1();
		scenario2();
		scenario3();
		scenario4();
		scenario5();
		scenario6();
	}
}
