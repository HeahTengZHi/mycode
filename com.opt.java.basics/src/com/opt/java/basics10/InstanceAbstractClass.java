package com.opt.java.basics10;

public abstract class InstanceAbstractClass {
	abstract void getLanguage();
}

abstract class Java extends InstanceAbstractClass{
	
}

abstract class ReactJS extends InstanceAbstractClass{
	
}

class Kotlin extends Java{

	@Override
	void getLanguage() {
		System.out.println("Kotlin ==> getLanguage()");
	}
}

class SprintBoot extends Java{

	@Override
	void getLanguage() {
		System.out.println("SprintBot ==> getLanguage()");
	}
}

class Redux extends ReactJS{

	@Override
	void getLanguage() {
		System.out.println("Redux ==> getLanguage()");
	}
}