package com.opt.java.basics14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class DeSerializationDemo {
	//Must link to SerializationDemo's MyClassSerialization method so that can read the variable within the method
	MyClassSerialization refSerializationDemo;
	FileInputStream refFileInputStream;
	ObjectInputStream refObjectInputStream;

	void myMethod() {
		try {
			refFileInputStream=new FileInputStream("customer.txt");
			refObjectInputStream=new ObjectInputStream(refFileInputStream);
			refSerializationDemo=(MyClassSerialization) refObjectInputStream.readObject(); //down casting

			//print on console
			System.out.println("Customer Name: "+refSerializationDemo.name);
			System.out.println("Customer Name: "+refSerializationDemo.city);
			System.out.println("Customer Name: "+refSerializationDemo.mobile);
		}catch (Exception e) {

		}finally {
			try {
				refFileInputStream.close();
				refObjectInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	public static void main(String[] args) {
		DeSerializationDemo refDeserializationDemo=new DeSerializationDemo();
		refDeserializationDemo.myMethod();
	}

}
