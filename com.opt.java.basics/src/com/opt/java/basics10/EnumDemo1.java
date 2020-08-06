package com.opt.java.basics10;

// First of all, don't get confused with the term called ==> enumeration

//In Java, we have Enumeration interface (collection framework) ==> java.util.Enumeration
//enumeration() method is used ==> java.util.Collections.enumeration()

//Then what is enum??
//How to define it??

//Enum is a reserved java keyword (Java 1.5)
//Enum (abstract class) ==> java.lang.Enum (Oracle documentation)
//JVM internally works for values(),ordinal(), valuesOf()
//purpose of enum ==> compile time type safety

class Payment{
	
	//enum is a special class in Java
	enum PaymentOptions{
		//It is a constant reference 
		VISA("Connect to Server 1"),
		PAYPAL("Connect to Server 2"),
		MASTERCARD("Connect to Server 3");
		
		private String serverConnection;
		
		//Create Constructor
		PaymentOptions(String serverConnection){
			this.serverConnection=serverConnection;
		}
		
		public String getConnection() {
			return serverConnection;
		}
		
	}// end of PaymentOptions
	
	//get the data from enum
	void getEnumData() {
		for(PaymentOptions temp: PaymentOptions.values()) {
			System.out.println(temp.ordinal()+" "+temp.name()+" "+temp.getConnection());
		}
		
		//enum to String (constant reference ==>String)
		String connection1=PaymentOptions.VISA.getConnection();
		System.out.println(connection1);
		
		//To get enum constant by name, valueOf()
		PaymentOptions connection2=PaymentOptions.valueOf("PAYPAL");
		System.out.println(connection2.getConnection());
	}
}//end of Payment


public class EnumDemo1 {

	public static void main(String[] args) {
		new Payment().getEnumData();
	}

}
