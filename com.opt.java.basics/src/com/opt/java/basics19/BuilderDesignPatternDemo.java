package com.opt.java.basics19;

import java.util.Scanner;

import com.opt.java.basics19.Employee.EmployeeBuilder;


public class BuilderDesignPatternDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter token to Authenticate : ");
		String token1=sc.next();
		Employee refEmployee= new Employee.EmployeeBuilder("Heah", 12353).address("Pioneer").build(token1);
		System.out.println("refEmployee1"+ refEmployee);
		System.out.println(refEmployee.getEmployeeName());
		
		
		new Employee.EmployeeBuilder(refEmployee).address("Ang Mo Kio").build("optimum");
		System.out.println("refEmployee1"+ refEmployee);
		
		
		System.out.println("Enter token to Authenticate : ");
		String token2=sc.next();
		
		Employee refEmployee2= new Employee.EmployeeBuilder("Chen", 5435435).address("Jurong").build(token2);
		System.out.println("refEmployee2"+refEmployee2);
	}

}
