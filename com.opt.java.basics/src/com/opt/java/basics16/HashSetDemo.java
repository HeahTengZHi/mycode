package com.opt.java.basics16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
//		//Not allow duplicate values
//		Set<String> refSet=new HashSet<>();
		
		//Not allow null in TreeSet
		Set<String> refSet=new TreeSet<>(String.CASE_INSENSITIVE_ORDER);//display in order by alphabet
		
 		refSet.add("Japan");
 		refSet.add("Singapore");
 		refSet.add("Japan");
 		refSet.add("africa");
 		refSet.add("British");
 		
 		
 		//By using iterator interface we can also print the output
 		Iterator refIterator=refSet.iterator();
 		while(refIterator.hasNext()) {
 			System.out.println(refIterator.next());
 		}
 		
 		System.out.println("======================================================");
 		//Find something exist in list
 		boolean varFlag=refSet.contains("Singapore");
 		System.out.println(varFlag);
 		
 		//Check empty
 		boolean varBoolean =refSet.isEmpty();
 		System.out.println(varBoolean);
 		
 		System.out.println("======================================================");
 		
 		
 		System.out.println(refSet);
 		
 		refSet.forEach(System.out::println);
	}

}
