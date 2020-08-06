package com.opt.java.basics10;

public class InstanceOfOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceAbstractClass language[]=new InstanceAbstractClass[3];
		
		language[0]=new Kotlin();
		language[1]=new SprintBoot();
		language[2]=new Redux();
		
		for(InstanceAbstractClass i:language) {
			if(i instanceof Redux) {
				i.getLanguage();
			}
		}
	}

}
