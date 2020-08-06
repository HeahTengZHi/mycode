package com.opt.java.basics04;

class Parent{ //Super class or Base class
	
	static void showParentA() {
		System.out.println("showParentA");
	}//end of showParentA
	
	void showParentB() {
		System.out.println("showParentB");
	}//end of showParentB
}
//end of Parent

class Child extends Parent{ //Sub class or Derived class
	static void showChildA() {
		System.out.println("showChildA");
	}//end of showParentA
	
	void showChildB() {
		System.out.println("showChildB");
	}//end of showChildB
}//end of Child

public class InheritanceDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child refParent=new Child(); 
		//Show Child
		//Static method
		Child.showChildA();
		//Non-static method
		refParent.showChildB();
		
		
		//Show Parent
		//Static method
		Parent.showParentA();
		Child.showParentA();
		//Non-static method
		refParent.showParentB();
		
	}

}
