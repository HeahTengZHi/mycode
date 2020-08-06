package com.opt.java.basics07;

public class Person {
	int id;
	String name;
	
	public Person(String name,int id) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return id+" "+name;
	}
}
