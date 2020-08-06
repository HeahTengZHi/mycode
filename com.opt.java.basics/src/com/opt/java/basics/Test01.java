package com.opt.java.basics;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;
public class Test01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		String a="Alex is an idiot";
//		for(int i=a.length();0<i;i--) {
//			System.out.println(a.substring(0, i));
//			Thread.sleep(1000);
//		}//Q3 end

//		
//		String b=" ";
//		for(int i=20;0<i;i--) {
//			a=b+a;
//		} 
//		for(int i=0;i<a.length();i++) {
//			if(i==a.length()-2) {
//				i=0;
//			}else if(i>a.length()/2) {
//				System.out.println(a.substring(i, a.length()));
//				Thread.sleep(100);
//			}else {
//				System.out.println(a.substring(i, a.length()/2+i));
//				Thread.sleep(100);
//			}
//		}// Q2 end
		
		//Problem 1
//		for(int i=1;i<5;i++) {
//			for(int j=0;j<i;j++) {
//			System.out.print("* ");
//			}System.out.println();
//		}
//		
//		//Problem 2
//		for(int i=1;i<=6;i++) {
//			for(int j=1;j<i;j++) {
//			System.out.print(j);
//			}System.out.println();
//		}
//		
//		//Problem 3
//		char c='A';
//		for(int i=1;i<6;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(c);
//				}System.out.println();
//				c++;
//		}
//		
//		//Problem 4
//		for(int i=5;1<i;i--) {
//			for(int j=1;j<i;j++) {
//			System.out.print("* ");
//			}System.out.println();
//		}
//		
//		//Problem 5
//		for(int i=6;1<i;i--) {
//			for(int j=1;j<i;j++) {
//			System.out.print(j);
//			}System.out.println();
//		}
//		
		//Problem 6
//		for(int i=1;i<8;i++) {
//			for(int  j=0;j<i;j++) {
//			System.out.print("*");
//			}
//			for(int k=2;k<i;k++) {
//				System.out.print("*");
//				}
//			System.out.println();
//		}
//		
//		//Problem 7
//		int x=0;
//		for(int i=1;i<6;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.print(i+x);
//				x++;
//			}
//			x+=i-2;
//			for(int k=0;k<i-1;k++) {
//				System.out.print(x);
//				x--;
//			}
//			System.out.println();
//			x=0;
//		}
		
		//Problem 8
//		for(int i=6;0<i;i--) {
//			for(int j=0;j<i;j++) {
//			System.out.print("*");
//			}
//			for(int k=2;k<i;k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//Problem 9
//		int [] intArray=new int[20];
//		//Add value in Array
//		for(int i=0;i<20;i++) {
//			intArray[i]=i;
//		}
//		//the value you want to find in Array
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number you want to find");
//		int findNumber=sc.nextInt();
//		String str="Number exist in array ";
//		//Search
//		for(int i=0;i<intArray.length;i++) {
//			if(findNumber==intArray[i]) {
//				str+=i+",";
//			}
//		}
//		//Check exist or not
//		if(str.equals("Number exist in array ")) {
//			System.out.println("Number not exist");
//		}else {
//			System.out.println(str);
//		}
		
		//Problem 10
//		int [] input1=new int[]{1, 5, 10, 20, 40, 80};
//		int [] input2=new int[]{6, 7, 20, 80, 100};
//	    int [] input3=new int[]{3, 4, 15, 20, 30, 70, 80, 120};
//	    
//	    String output="";
//	    for(int i=0;i<input1.length;i++){
//	    	for(int j=0;j<input2.length;j++) {
//	    		if(input1[i]==input2[j]){
//	    			for(int k=0;k<input3.length;k++){
//	    				if(input2[j]==input3[k]) {
//	    					output+=input3[k]+",";
//	    				}
//	    			}
//	    		}
//	    	}
//	    }
//	    System.out.println(output.substring(0, output.length()-1));
		
		//Problem 11
//		int [] inputArray=new int[]{1, 2, 3, 1,2,3, 4};	
//		List<Integer> outputList=new ArrayList<Integer>();
//		Arrays.parallelSort(inputArray);
//		outputList.add(inputArray[0]);
//		for(int i=0;i<inputArray.length-1;i++) {
//			if(inputArray[i]!=inputArray[i+1]){
//				outputList.add(inputArray[i+1]);
//			}
//		}
//		System.out.println(outputList);
//	
//		//Problem 12
//		//Find the second largest and smallest within the array
//		System.out.println("Second smaller is: "+outputList.get(1)+ " and "+"Second largest is :"+outputList.get(outputList.size()-2));
		
		//Problem 13
//		int [] inputArray=new int[] {90,20,30,40,50,70,50,50,60,60,80,90,20};
//		int [] outputArray;
//		Arrays.parallelSort(inputArray);
//		String s=inputArray[0]+",";
//		for(int i=0;i<inputArray.length-1;i++) {
//			if(inputArray[i]!=inputArray[i+1]){
//				outputArray=new int [i+1];
//				outputArray[i]=inputArray[i+1];
//				s+=outputArray[i]+",";
//			}
//		}
//		
//		System.out.println(s);
		
		//Problem 16
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Number of loop you want to print.");
//		int x=sc.nextInt();
//		int [] array=new int[x];
//		array[0]=0;
//		array[1]=1;
//		String s=array[0]+","+array[1];
		
		// for loop
//		for(int i=2;i<x;i++) {
//			array[i]=array[i-2]+array[i-1];
//			s+=","+array[i];
//		}
//		System.out.println(s);
		
		//while loop
//		int i=2;
//		while(i<x) {
//			array[i]=array[i-2]+array[i-1];
//			s+=","+array[i];
//			i++;
//		}
//		System.out.println(s);
		
		//Problem 17
//		Scanner sc=new Scanner(System.in);
//		System.out.println("What is the number of Factorial you want to print.");
//		int n=1;
//		int x=sc.nextInt();
//		//for loop
//		for(int i=1;i<=x;i++) {
//			n*=i;
//		}
//		System.out.println(n);
		
		//BigInteger
//		BigInteger a=new BigInteger("22");
//		System.out.println(a);
//		
		//while loop
//		int i=1;
//		while(i<=x) {
//			n*=i;
//			i++;
//		}
//		System.out.println(n);
		//Recursion (Call from method)
//		new Test01().Factorial(x);
		
		//Problem 18
//		String number="153";
//		int x=0;
//		for(int i=0; i<number.length();i++) {
//			int a=Integer.parseInt(number.substring(i,i+1));
//			x+=(a*a*a);
//		}
//		if(number.equals(Integer.toString(x))) {
//			System.out.println("Armstrong number");
//		}else {
//			System.out.println("Not Armstrong number");
//		}
//		
		//Problem 19
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please insert value!!");
//		int x=sc.nextInt();
//		x=x*x;
//		//The purpose of convert into String is to find each character one by one
//		String s=Integer.toString(x);
//		for(int i=0;i<s.length();i++) {
//			if(s.length()==1) 
//				System.out.println("The value is Palindrome");
//			else if(s.charAt(i)!=s.charAt(s.length()-(1+i))) {
//				System.out.println("The value is not Palindrome");
//				break;
//			}else if((i+1)==s.length()/2)
//				System.out.println("The value is Palindrome");
//			else
//				continue;
//		}

		
		//Problem 20
		//Using Reverse
//		String s="madam";
//		String temp="";
//		
//			for(int i=0;i<s.length();i++) {
//				temp+=s.charAt(s.length()-(1+i));
//			}
//			if(s.equals(temp)) 
//				System.out.println("The string is Palindrome");
//			else 
//				System.out.println("The string is not Palindrome");
			
		
		//Without Reverse
//		for(int i=0;i<s.length()/2;i++) {
//			if(s.charAt(i)!=s.charAt(s.length()-(1+i))){
//				System.out.println("The string is not Palindrome");
//				break;
//			}else if((i+1)==s.length()/2) 
//				System.out.println("The string is Palindrome");
//			else 
//				continue;
//			
//		}
	}
	
	//Problem 17
//	void Factorial(int x) {
//		int n=1;
//		for(int i=1;i<=x;i++) {
//			n*=i;
//		}
//		System.out.println(n);
//	}
	
}


