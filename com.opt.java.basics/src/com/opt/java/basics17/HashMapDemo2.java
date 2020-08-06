package com.opt.java.basics17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;


interface lambda{
	void something(int x, int y);
	static void something2(int k) {}
}

//To do task for today
//1.How HashMap works internally with a index diagram
//HashMap accept null and not synchronized but HashTable doesn't accept null and synchronized
//, the benefit of using HashMap is fast and retrieve 2 different object on constant time.
//It supports Generics

//2. Take Key as Question and Value as Answer. Generate a MCQ of 5 Questions
//	Ask user to enter choice from options A,B,C,D
//	if the choice is correct, then 1 point else 0 point
//	finally will print total scores

public class HashMapDemo2 {
	static int y=0;
	static int score=0;
	static String userAnswer="";
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Map<Employee,String> refMap=new HashMap<>();
		refMap.put(new Employee(101,"Sera"), "Google");
		refMap.put(new Employee(101,"Shakti"), "Google");
		refMap.put(new Employee(101,"Ain"), "Facebook");
		refMap.put(new Employee(222,"Ain"), "Microsoft");
		
		Optional<Employee> e=refMap.keySet().stream().filter(re-> re.id==101&& refMap.get(re).equals("Google")).findAny();
		
		System.out.println(e.isPresent());
		
		refMap.entrySet().forEach(System.out::println);
		Employee refEmployee=new Employee(555,"Micah");
		
		//Insert into refMap
		refMap.put(refEmployee, "Yahoo");
		
		refMap.keySet().forEach(key->{if(key.id==101&& refMap.get(key).equals("Facebook")) {
		System.out.println("true"); return;}});
		
		for(Employee key:refMap.keySet()) {
			if(key.id==101&& refMap.get(key).equals("Facebook")) {
				System.out.println("true");
				break;
			}
		}
		
		System.out.println(refMap.containsKey(refEmployee));
		System.out.println(refMap.containsValue("Yahoo"));
		System.out.println(refMap.containsValue("Nothing"));
		
		
		
		Map<String,String> MCQ=new LinkedHashMap<>(); // to print in order use LinkedHashMap
		MCQ.put("\nQ1. In which Java version has Lambda expression?\nA.5\nB.6\nC.7\nD.8", "D");
		MCQ.put("\nQ2. 1+1=?\nA.6\nB.2\nC.3\nD.15", "B");
		MCQ.put("\nQ3. 2+2=?\nA.6\nB.2\nC.4\nD.15", "C");
		MCQ.put("\nQ4. 3+3=?\nA.6\nB.2\nC.4\nD.15", "A");
		MCQ.put("\nQ5. 5*3=?\nA.6\nB.2\nC.4\nD.15", "D");
		
		MCQ.keySet().forEach(key->{System.out.print(key+"\nAnswer: ");
		userAnswer=sc.next(); 
		if(MCQ.get(key).equalsIgnoreCase(userAnswer)) 
		{score++;System.out.println("Excellent.."+"\nYour Score: "+score);}
		else System.out.println("Sorry.."+"\nYour Score: "+score);} );
		
		
	}

}
