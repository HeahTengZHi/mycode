package com.opt.java.basics04;

public class CommandLineArgumentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp []= args;
		String output="";
		
		for(String s:temp) {
			output+=s+" ";
		}
		
//		for(int i=0;i<temp.length;i++) {
//			output+=temp[i]+" ";
//		}	
		System.out.println(output);
	}
}
