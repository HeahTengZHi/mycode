package com.opt.java.basics19;

import java.util.HashMap;
import java.util.Map;

//Credit Card and Payment service
interface PaymentChannel extends Cloneable{
	public PaymentChannel clone() throws CloneNotSupportedException;
}

//Credit Card service
class PayLa implements PaymentChannel{
	
	String security="PayLa Security Gateway...";
	
	@Override
	public PayLa clone() throws CloneNotSupportedException {
		System.out.println("Cloning PayLa...");
		System.out.println(getSecurity());
		return (PayLa) super.clone();
	}
	
	public String getSecurity() {
		return security;
	}
}

//Payment service
class GooglePay implements PaymentChannel{
	
	String security="GooglePay Security Gateway...";
	
	@Override
	public GooglePay clone() throws CloneNotSupportedException {
		System.out.println("Cloning GooglePay...");
		System.out.println(getSecurity());
		return (GooglePay) super.clone();
	}
	
	public String getSecurity() {
		return security;
	}
}



class PaymentFactory{
	
	private static final Map<String,PaymentChannel> refMap=new HashMap<>();
	
	static { //static block
		refMap.put("userChoice1", new PayLa());
		refMap.put("userChoice2", new GooglePay());
	}
	
	
	public static PaymentChannel getPrototype(String choice){ 
		try {
			return refMap.get(choice).clone();		//we will get(),coz static will execute first
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
}


public class PrototypeDesignPatternDemo {

	public static void main(String[] args) {
		
		PaymentFactory.getPrototype("userChoice2");
		
	}

}
