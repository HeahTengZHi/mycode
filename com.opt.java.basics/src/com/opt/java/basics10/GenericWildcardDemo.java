package com.opt.java.basics10;

import java.util.ArrayList;

class A{
	String name;
	int age;
	
	A(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return name+" and age "+age;
	}

}

class B extends A{

	B(String name, int age) {
		super(name, age);
	}
	
//	String name;
//	int age;
//	
//	B(String name,int age){
//		this.name=name;
//		this.age=age;
//	}
//	
//	public String toString() {
//		return name+" and age "+age;
//	}
	
}

public class GenericWildcardDemo {

	public static void main(String[] args) {
		// Method 1
		ArrayList<A> refA=new ArrayList<A>();
		refA.add(new A("MyName",25));
		refA.add(new A("MyName1",24));
		
		ArrayList<B> refB=new ArrayList<B>();
		refB.add(new B("MyNameClassB-1",14));
		refB.add(new B("MyNameClassB-2",19));
		
		new GenericWildcardDemo().genericWildcard(refB);
		new GenericWildcardDemo().genericWildcard2(refA);
		new GenericWildcardDemo().genericWildcard3(refB);
		
		//Method 2 more generic
//		ArrayList<Object> refAB=new ArrayList<Object>();
//		refAB.add(new A("MyName",25));
//		refAB.add(new A("MyName1",24));
//		refAB.add(new B("MyNameClassB-1",14));
//		refAB.add(new B("MyNameClassB-2",19));
//		
//		new GenericWildcardDemo().genericWildcard(refAB);
//		new GenericWildcardDemo().genericWildcard2(refAB);
//		new GenericWildcardDemo().genericWildcard3(refAB);
	}

	//Only accept the class extended by class B
	void genericWildcard(ArrayList<? super B> list) {
		//If use super the foreach must use Object
		for(Object a:list) {
			System.out.println(a);
		}
	}
	
	//Will only accept A and the class extends A
	void genericWildcard2(ArrayList<? extends A> list) {
		//If use extends the foreach can be used Object or A
		for(Object a:list) {
			System.out.println(a);
		}
	}
	
	//?: Will accept every Object
	void genericWildcard3(ArrayList<?> list) {
		//If use extends the foreach can be used Object or A
		for(Object a:list) {
			System.out.println(a);
		}
	}
	//In conclusion just use Object and (method 2 & genericWildcard3) for convenience and generic
}
