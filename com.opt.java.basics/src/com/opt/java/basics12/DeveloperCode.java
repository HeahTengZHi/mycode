package com.opt.java.basics12;

import org.junit.*;

public class DeveloperCode {
	
	
	@BeforeClass
	public static void openBrowser() {
		System.out.println("Open the Browser...");
	}
	
	@After
	public void loginApplication1() {
		System.out.println("Login to Application1...");
	}
	
	
	@Before
	public void loginApplication2() {
		System.out.println("Login to Application2...");
	}
	
	
	@Test
	public void myDashBoard() {
		System.out.println("Welcome to Dash Board...");
	}
	
	@After
	public void logoutApplication1() {
		System.out.println("Logout to Application1...");
	}
	@Before
	public void logoutApplication2() {
		System.out.println("Logout to Application2...");
	}
	
	@AfterClass
	public static void closeBrowser() {
		System.out.println("Close Browser...");
	}
}
