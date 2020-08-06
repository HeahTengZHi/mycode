package com.opt.java.basics04;

class Visitor{
	int numberOfVisitors=5;
	void showVisitorData(){
		System.out.println("Visitors Data");
	}
}

class Workers extends Visitor{
	int numberOfWorkers=10;
	void showWorkerData(){
		System.out.println("Workers Data");
	}
}

class MySubClass extends Workers{
	
	void getBuildingData(){
		showVisitorData();
		showWorkerData();
		//Use other class variable
		System.out.println("Number of workers: "+numberOfWorkers+" and Number of visitors: "+numberOfVisitors);
	}
}

public class InheritanceInCovid19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySubClass refMySubClass=new MySubClass();
		refMySubClass.getBuildingData();
	}

}
