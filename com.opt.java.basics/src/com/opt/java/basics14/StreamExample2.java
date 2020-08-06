package com.opt.java.basics14;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.stream.IntStream;

public class StreamExample2 {

	public static void main(String[] args) {

		IntSummaryStatistics intSummaryStatistics= new IntSummaryStatistics(); 

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int[] a= {1,2,3,4,5,5,5};
		//Remove duplicate values, limit the array size and print all out
		IntStream.of(a).distinct().limit(6).forEach(System.out::print);
		
		
		Iterator<Integer> iterator = list.listIterator(); 
		while (iterator.hasNext()) { 
			// Add the integers into the IntSummaryStatistics object 
			intSummaryStatistics.accept(iterator.next()); 
		} 

		// Find list length
		System.out.println("\nThe count of values is "
				+ intSummaryStatistics.getCount());
		
		// Find Average inside the list
		System.out.println("The average of values is "
				+ intSummaryStatistics.getAverage()); 
		
		//Sum every value inside the list
		System.out.println("The sum of values is "
				+ intSummaryStatistics.getSum()); 
		
		//Find the Max inside the list
		System.out.println("The maximum of values is "
				+ intSummaryStatistics.getMax()); 
		
		//Find the Max inside the list
		System.out.println("The minimum of values is "
				+ intSummaryStatistics.getMin()); 
		
		//Print all out
		System.out.println("The string representation is"); 
		System.out.println(intSummaryStatistics.toString()); 
	}

}
