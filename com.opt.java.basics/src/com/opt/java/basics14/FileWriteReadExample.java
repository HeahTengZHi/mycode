package com.opt.java.basics14;
import java.io.*;
import java.util.Scanner;


public class FileWriteReadExample {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//Call the method below
		new FileWriteReadExample().ReadWriteFile();
	}
	
	void ReadWriteFile() {
		System.out.println("Write something: ");
		String data=sc.nextLine();
		
		FileWriter refFileWriter=null;
		File refFileReader = null;
		
		int numberLines=0;
		int numberWords=0;
		try {
			//If file exists will auto create else straight away write in file
			refFileWriter =new FileWriter("test.txt",true);
			PrintWriter pw=new PrintWriter(refFileWriter);
			//println = write line
			pw.println(data);
			pw.close();
			
			refFileReader=new File("test.txt");
			Scanner fileReader=new Scanner(refFileReader);
			while(fileReader.hasNextLine()) {
				//Read the line and convert it to string
				String fileData=fileReader.nextLine();
				//Print it out
				System.out.println(fileData);
				//Pass 1 for every loop = number of line in File
				numberLines++;
				//Add number of words everytime it looping
				numberWords+=fileData.length();
			}
			fileReader.close();
			System.out.println("Number of Lines: "+numberLines);
			System.out.println("Number of Words: "+numberWords);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				refFileWriter.close();
				//Re-run the method
				ReadWriteFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
