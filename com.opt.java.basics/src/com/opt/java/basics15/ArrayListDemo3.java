package com.opt.java.basics15;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo3 {

	public static void main(String[] args){
		List<Employee> refList=new ArrayList <>();
		refList.add(new Employee(153,"Bana","22/2/2022"));
		refList.add(new Employee(143,"Cana","17/2/2020"));
		refList.add(new Employee(133,"Aana","14/04/2002"));
		refList.add(new Employee(123,"Dana","13/04/2001"));
		refList.add(new Employee(113,"Eana","12/04/2000"));
		
		
		refList.forEach(System.out::println);
		//=======================================================
		System.out.println("Sort by Name: ");
		Collections.sort(refList,new Comparator<Employee>(){

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getName().compareTo(e2.getName());
			}
		});
		refList.forEach(System.out::println);
		
		//=======================================================
		System.out.println("Sort by ID: ");
		Collections.sort(refList,new Comparator<Employee>(){

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getId()-e2.getId();
			}
		});
		refList.forEach(System.out::println);
		

		//=======================================================
		System.out.println("Sort by Date: ");
		Collections.sort(refList,new Comparator<Employee>(){

			@Override
			public int compare(Employee e1, Employee e2) {
				// TODO Auto-generated method stub
				return e1.getDate().compareTo(e2.getDate());
			}
		});
		refList.forEach(System.out::println);
		
		//Comparator Method
		System.out.println("\nComparator Method Sort by ID: ");
		Comparator<Employee> comp1=Comparator.comparing(Employee::getId);
		Collections.sort(refList,comp1);
		refList.forEach(System.out::println);
		
		System.out.println("Comparator Method Sort by Name: ");
		Comparator<Employee> comp2=Comparator.comparing(Employee::getName);
		Collections.sort(refList,comp2);
		refList.forEach(System.out::println);
		
		System.out.println("Comparator Method Sort by Date: ");
		Comparator<Employee> comp3=Comparator.comparing(Employee::getDate);
		Collections.sort(refList,comp3);
		refList.forEach(System.out::println);
	}

}
