package com.opt.java.basics14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Import for stream function
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamExample {

	static Scanner sc=new Scanner(System.in);
	static int numberWords=0;
	static int numberLines=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadWriteFile();
	}
	
	static void ReadWriteFile() {
		System.out.println("Write something: ");
		String data=sc.nextLine();
		List<String> list=new ArrayList();
		FileWriter refFileWriter=null;
		File refFileReader = null;
		
		

		
		try {
			
			//If file exists will auto create else straight away write in file
			refFileWriter =new FileWriter("test.txt",true);
			PrintWriter pw=new PrintWriter(refFileWriter);
			//println = write line
			pw.println(data);
			pw.close();
			
			//Use stream filter method to find multiple data
			Stream<String> stream=Files.lines(Paths.get("test.txt")).filter(dataInFile->dataInFile.equals("123"));
			stream.forEach(System.out::println);

			//Use stream filter method to find one data
//			String stream=Files.lines(Paths.get("test.txt"))
//			.filter(dataInFile->dataInFile.equals("Im Heah"))
//			.findAny()
//			.orElse("Not found");
//			System.out.println(stream);
			
			//Use Stream read line by line
//			Stream<String> stream=Files.lines(Paths.get("test.txt"));
//			//Lambda expression print out number of words, lines and all the data in the file
//			stream.forEach(n->{if(n.length()!=0){for(int i=0;i<n.length();i++) if(n.charAt(i)!=' ') numberWords++;} numberLines++;System.out.println(n);});
//			System.out.println("Number of words: "+numberWords+", Number of lines: "+numberLines);
			
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
