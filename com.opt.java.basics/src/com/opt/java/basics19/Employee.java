package com.opt.java.basics19;

public class Employee {
	private String employeeName;
	private long mobile;
	private String address;
	
	//Rule 1: no setter method, only getter method
	public String getEmployeeName() {
		return employeeName;
	}
	
	public long getMobile() {
		return mobile;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	//Create 2 times variable will increase memory.
	//Rule 2: create a static inner class
	static class EmployeeBuilder{
		private String employeeName;
		private long mobile;
		private String address;
		//create constructor
		public EmployeeBuilder(Employee employee){
			this.employeeName=employee.getEmployeeName();
			this.mobile=employee.getMobile();
			this.address=employee.getAddress();
		}
		
		public EmployeeBuilder(){
		}
		
		EmployeeBuilder(String employeeName,long mobile){
			this.employeeName=employeeName;
			this.mobile=mobile;
		}
		
		//create a method
		public EmployeeBuilder address(String address) {
			this.address=address;
			return this;
		}
		
		
		public EmployeeBuilder employeeName(String employeeName) {
			this.employeeName = employeeName;
			return this;
		}

		public EmployeeBuilder mobile(long mobile) {
			this.mobile = mobile;
			return this;
		}

		//Write a build method
		public Employee build(String choice) {
			Employee refEmployee=null;
			
			if(choice.equals("optimum")) {
				refEmployee=new Employee(this); //this: will link to constructor
				return refEmployee;
			}else {
				System.out.println("Authentication fails..");
			}
			
			return refEmployee;
		}
	}
	
	EmployeeBuilder refEmployeeBuilder2=new EmployeeBuilder();
	
	//Rule 3: create a constructor
	private Employee(EmployeeBuilder refEmployeeBuilder) { //we have pass the reference of inner class
		this.employeeName=refEmployeeBuilder.employeeName;
		this.mobile=refEmployeeBuilder.mobile;
		this.address=refEmployeeBuilder.address;
	}
}
