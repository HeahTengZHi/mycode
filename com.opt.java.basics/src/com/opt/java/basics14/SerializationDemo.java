package com.opt.java.basics14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MyClassSerialization implements Serializable {
	
	String name;
	//end user cant see the data
	static String city;
	//end user cant see the data
	transient int mobile;
	MyClassSerialization refMyClassSerialization;
	FileOutputStream refFileOutputStream;
	ObjectOutputStream refObjectOutputStream;

	void myMethod() {
		refMyClassSerialization = new MyClassSerialization();
		refMyClassSerialization.name = "Gabriel";
		refMyClassSerialization.city = "Singapore";
		refMyClassSerialization.mobile = 1234141;

		try {
			refFileOutputStream = new FileOutputStream("customer.txt"); // customer.doc/docx/html
			refObjectOutputStream = new ObjectOutputStream(refFileOutputStream);
			refObjectOutputStream.writeObject(refMyClassSerialization);


		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				System.out.println("closing file..");
				refFileOutputStream.close();
				refObjectOutputStream.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}

		}	// end of finally

	}	// end of myMethod
}	// end of class

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClassSerialization refMyClassSerialization = new MyClassSerialization();
		refMyClassSerialization.myMethod();
	}

}
