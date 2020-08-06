package com.opt.java.basics05;

abstract class Function{
	String status="";
	int x=5;
	void OnCamera() {
		System.out.println("Camera On");
	}
	
	void OffCamera() {
		System.out.println("Camera Off");
	}
	
	String ZoomIn() {
		if(status.equals("On")) {
			return "Zoom in x"+(x+5);
		}else {
			return "Camera is off";
		}
	}
	
	String ZoomOut() {
		if(status.equals("On")) {
			return "Zoom in x"+(x-5);
		}else {
			return "Camera is off";
		}
	}
	 
	abstract void operation();
	
}

class HuaweiPhone extends Function{

	@Override
	void operation() {
		// TODO Auto-generated method stub
		if(super.status.equals("")||super.status.equals("off")) {
			OnCamera();
		}else {
			OffCamera();
		}
	}
	
}
//===================================================================
abstract class CreditCard{
	
	void details() {
		//method with a body [concrete method]
		System.out.println("31231232");
	}
	
	abstract void cardDetails(); //method without a body [abstract method]
	
}//end of CreaditCard

class Visa extends CreditCard{

	@Override
	void cardDetails() {
		// TODO Auto-generated method stub
		details();
	}
	
}

public class AbstractionDemp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Visa().cardDetails();
		new HuaweiPhone().operation();
	}

}
