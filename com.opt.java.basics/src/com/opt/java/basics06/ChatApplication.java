package com.opt.java.basics06;

public class ChatApplication {
	private String name;
	//getData method 1
//	public String getName() {
//		return name;
//	}
	
	//getData method 2
	@Override
	public String toString() {
		return name;
	}
	
	
	
	//setData method 1
//	public void setName(String name) {
//		this.name = name;
//	}
	
	//setData method 2
	ChatApplication(String name){
		this.name=name;
	}
}
