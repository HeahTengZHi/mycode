package com.opt.java.basics09;

import java.lang.annotation.*;


//What is annotation??
//Annotation is start with “@”
//
//When to use it?
//Annotations do not change action of a compiled program but it help to associate metadata
//and additional information to the program elements such as instance variables, constructors, methods, classes, etc. 
//
//Built-In Java Annotations used in Java code
//@Override
//@SuppressWarnings
//@Deprecated
//
//We also can create our own annotation for the additional information in our
//class
//
//Annotations are not pure comments as they can change the way a program is treated by compiler. Just like what we did during the overridding



//For calling out the additional metadata from the class


//RetentionPolicy.Class for annotations to be included in class file but cant read reflectively
//RetentionPolicy.RUNTIME allow annotation to be available at runtime

//Target is use to decide which type of elements can be marked by the annotation
@Inherited //It makes the parent class's annotation value will also pass together
@Target(ElementType.TYPE) //Type: for class,abstract and interface
@Retention(RetentionPolicy.RUNTIME)
@interface computer{
	String os() default "Windows";
	int version() default 10;
}

//@Documented //The annotation should be displayed in Java doc it can be apply every location
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE) //RetentionPolicy.Source for annotations which are intended for compiler only
@interface OverrideCode{		  //It use to check parent class, method, parameter etc
	
}

abstract class Method{
	int n=100;
	void test() {
		System.out.println("Hello");
	}
	
	abstract void MethodTest();
}

@computer //(os="Windows", version=10)
class Asus extends Method{
	String model;
	int price;
	
	Asus(String model,int price){
		this.model=model;
		this.price=price;
	}
	
	@OverrideCode
	void MethodTest() {
		test();
		System.out.println(n);
	}
	
}

//Acer get the additional information from @computer because it extends Asus class
class Acer extends Asus{

	Acer(String model, int price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}
	
}

public class AnnotationExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asus a1=new Asus("AsusA1",1000);
		System.out.println(a1.model+" and "+a1.price);
		
		Acer acer1=new Acer("Acer1",2000);
		System.out.println(acer1.model+" and "+acer1.price);
		
		//Call abstract method
		a1.MethodTest();
		
		Class c=a1.getClass();
		Annotation an=c.getAnnotation(computer.class);
		computer a=(computer) an;
		System.out.println(a.os()+" and version: "+a.version());
		
		
		//For Acer Inherited annotation by Asus
		Class acer=acer1.getClass();
		Annotation acerAnotation=acer.getAnnotation(computer.class);
		computer aA=(computer) acerAnotation;
		System.out.println(aA.os()+" and version: "+aA.version());
	}

}
