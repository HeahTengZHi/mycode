package com.opt.java.basics;

public class Example04 {
	
	public String str1="Public";
	protected String str2="Protected";
	String str3="Default";
	private String str4="Private";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example04().displayMethodPublic();
		new Example04().displayMethodProtected();
		new Example04().displayMethodDefault();
		new Example04().displayMethodPrivate();
		
		System.out.println(new Example04().str1);
		System.out.println(new Example04().str2);
		System.out.println(new Example04().str3);
		System.out.println(new Example04().str4);
	}
	
	public void displayMethodPublic() {
		System.out.println("Test Modifier Public");
	}
	
	protected void displayMethodProtected() {
		System.out.println("Test Modifier Protected Example04");
	}
	
	void displayMethodDefault() {
		System.out.println("Test Modifier Default");
	}
	
	private void displayMethodPrivate() {
		System.out.println("Test Modifier Private");
	}
}
