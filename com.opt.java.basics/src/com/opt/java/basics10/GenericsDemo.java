package com.opt.java.basics10;



//In Java Collection framework we list interface
//List<T> 
interface Book<Adrian>{	//<T> ==>type, <Adrian> is a Type
	void showBook(Adrian refAdrian);
}

class Java1<Ain321> implements Book<Ain321>{ //<CanBeAnyName>

	@Override
	public void showBook(Ain321 refName) {
		System.out.println(refName);
	}
	
}

class Person{
	
	@Override
	public String toString() {
		return "Micah";
	}
	
}

public class GenericsDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generics does not support primitive data types
//		int id=50;
//		Java1<int> ref=new Java<int>(); 
		
		String name="data1";
		Java1<String> ref1=new Java1<String>();
		ref1.showBook(name);
		
		Integer number=20;
		Java1<Integer> ref2=new Java1<Integer>();
		ref2.showBook(number);
		
		Person p1=new Person();
		Java1<Person> ref3=new Java1<Person>();
		ref3.showBook(p1);
	}

}
