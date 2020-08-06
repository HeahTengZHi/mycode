package com.opt.java.basics12;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//What is JUnit??
//JUnit is library which helps developer for Unit Testing

//Which Version of JUnit we are going to use?
//We will start with JUnit4, once we start Spring Boot we will cover JUnit5

//What is Unit Testing and when to do?
//Unit testing we do when we need to verify small chuck of code (method).
//We do Unit Testing in SIT Environment

//Developer needs to write Test Cases based on Test Scenario to ensure the method works fine

//Later, once we will create a maven project, that time we will write java application under src folder
//JUnit Test cases under test folder

//Phase 1
//Test Suite
//Different assert methods ... example: assertThat()...
//RunWith - JUnit 4-Parameterized tests

//Phase 2
//Prepare a Template in Excel, Write scenario, Write Test Cases for our Case Study -Banking Application
//Code level- Write JUnit Test cases to Test our Bank Application


@RunWith(Suite.class)
@Suite.SuiteClasses(DeveloperCode.class)
public class JUnitDemo1 {
	
	
	
	public static void myTestCase1() {
		new DeveloperCode().openBrowser();
	}
	
	
	
	public void myTestCase2() {
		new DeveloperCode().loginApplication1();
	}
	
	
	public void myTestCase3() {
		new DeveloperCode().loginApplication2();
	}
	
	
	public void myTestCase() {
		new DeveloperCode().myDashBoard();
	}
	
	
	public void myTestCase4() {
		new DeveloperCode().logoutApplication1();
	}
	
	
	public void myTestCase5() {
		new DeveloperCode().logoutApplication2();
	}
	
	
	public static void myTestCase6() {
		new DeveloperCode().closeBrowser();
	}
}
