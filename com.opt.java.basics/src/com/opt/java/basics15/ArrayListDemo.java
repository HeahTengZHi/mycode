package com.opt.java.basics15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List<String> refList=new ArrayList<>();
		refList.add("Singapore");
		refList.add("USA");
		refList.add("France");
		
		addName(refList);
		
	}
	
	static void addName(List<String> list) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name to ArrayList: ");
		String name=sc.next();
		
		for(String l:list) {
			if(l.equals(name)) {
				System.out.println("Name already present..");
				addName(list);
				return;
			}
		}
		list.add(name);
		Iterator refIterator=list.iterator();
		while(refIterator.hasNext()) {
			System.out.println(refIterator.next());
		}
		addName(list);
	}
}
