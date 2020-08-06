package com.opt.java.basics;

class Employee{
	
	int employeeID = 12099;
	static String employeeName = "Alex";
	
	void displayInformation() {
		
		System.out.println(employeeID);// call employeeID and employeeName
		System.out.println(employeeName);
	} //end of displayInformation
	
	static void displayInformation2() {
		//Create object new Employee()
		System.out.println(new Employee().employeeID);// call employeeID and employeeName
		System.out.println(employeeName);
	} // end of displayInformation2
	
} // End of Employee

public class Example02 {

	public static void main(String[] args) {
		// call displayInformation1() and displayInformation2() and print the output
		Employee ref = new Employee();
		ref.displayInformation();
		//or
		new Employee().displayInformation();
		
		
		//To call static method within static method need to specify the class name for access
		Employee.displayInformation2();//ClassName.methodName
		
	}

}
