package DatabaseConnection;

public class Employee {

	private int emp_ID;
	private String name;
	private String email;
	
	Employee(String name,String email){
		this.name=name;
		this.email=email;
	}
	
	Employee(){
	}
	
	
	public int getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return ",Name=" + name + " ,Email=" + email;
	}
	
	
}
