package com.opt.java.basics14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//FileReader and FileWriter

class WriteToFile{
	public static void createFile() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Write something to the file: ");
		String data=sc.nextLine();
		FileWriter refFileWriter=null;
		try {
			refFileWriter=new FileWriter("sample.txt"); //absolute path
			for (int i = 0; i < data.length(); i++) {
				refFileWriter.write(data.charAt(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				refFileWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//relative path ==> full file path in pc or www.theoptimum.net/home
		//absolute path ==> sample.txt
	}
}

class ReadFromFile{
	static void readFile() {
		FileReader refFileReader = null;
		int data;
		try {
			refFileReader=new FileReader("sample.txt");
			//while loop to read the file
			while((data=refFileReader.read())!=-1) {
				System.out.print((char)data);
			}
		}catch(Exception e) {
			
		}finally {
			try {
				refFileReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class FileWriteReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WriteToFile.createFile();
		ReadFromFile.readFile();
	}

}
