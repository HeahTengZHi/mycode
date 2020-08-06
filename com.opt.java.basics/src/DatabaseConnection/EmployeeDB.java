package DatabaseConnection;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class EmployeeDB implements DatabaseFunction<Integer,Employee>{
	
	
	DBUtil con= new DBUtil();
	Scanner sc=new Scanner(System.in);
	Map<Integer, Employee> employees=new ConcurrentHashMap<>();
	Employee emp=new Employee();
	//Stored Procedure use more heap memory.
	
	@Override
	public Map<Integer, Employee> getAllData() {
		//String selectEmployee="Select * from employee";
		try {
			//Statement pst=con.getConnection().createStatement();
			CallableStatement cs=con.getConnection().prepareCall("call getAllEmployee()");
			ResultSet rs=cs.executeQuery();
			System.out.println("Employee List:");
			while(rs.next()) {
				employees.put(rs.getInt(1), new Employee(rs.getString(2),rs.getString(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}
	
	
	@SuppressWarnings("finally")
	@Override
	public Map<Integer, Employee> addData() {
		System.out.print("Employee Name:");
		emp.setName(sc.next());
		System.out.print("Employee Email:");
		emp.setEmail(sc.next());
		try {
			//PreparedStatement pst = con.getConnection().prepareStatement("insert into employee (`name`, `email`) values(?,?)");
			CallableStatement cs=con.getConnection().prepareCall("call insertEmployee(?,?)");
			cs.setString(1,emp.getName());
			cs.setString(2,emp.getEmail());
			int empID=cs.executeUpdate();
			if(empID>0) {
				System.out.println("Employee: "+emp.getName()+" inserted\n");
				employees.put(emp.getEmp_ID(), new Employee(emp.getName(),emp.getEmail()));
			}	
			else
				System.out.println("Insert Fail!!\n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			return employees;
		}
		
	}
	
	
	@SuppressWarnings("finally")
	@Override
	public Map<Integer, Employee> updateData() {
		System.out.print("Employee ID:");
		emp.setEmp_ID(sc.nextInt());
		System.out.print("Employee Name:");
		emp.setName(sc.next());
		System.out.print("Employee Email:");
		emp.setEmail(sc.next());
		try {
			//PreparedStatement pst=con.getConnection().prepareStatement("update employee set name=?, email=? where emp_ID=?");
			CallableStatement pst=con.getConnection().prepareCall("call updateEmployee(?,?,?)");
			pst.setString(1,emp.getName());
			pst.setString(2,emp.getEmail());
			pst.setInt(3,emp.getEmp_ID());
			int updateEmp=pst.executeUpdate();
			if(updateEmp>0) {
				System.out.println("Employee records updated\n");
				employees.replace(emp.getEmp_ID(), emp);
			}
			else
				System.out.println("Update Fail!!\n");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			return employees;
		}
		
		
		
		// TODO Auto-generated method stub
		
	}
	
	
	@SuppressWarnings("finally")
	@Override
	public Map<Integer, Employee> deleteData() {
		System.out.print("Delete Employee ID:");
		emp.setEmp_ID(sc.nextInt());
		try {
			//PreparedStatement pst=con.getConnection().prepareStatement("delete from employee where emp_ID=?");
			CallableStatement pst=con.getConnection().prepareCall("call deleteEmployee(?)");
			pst.setInt(1,emp.getEmp_ID());
			int updateEmp=pst.executeUpdate();
			if(updateEmp>0) {
				System.out.println("Employee records deleted\n");
				employees.remove(emp.getEmp_ID());
			}
			else
				System.out.println("Fail to delete employee ID= "+emp.getEmp_ID());
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			return employees;
		}
	}
	
	void employeeMethod(){
		employees=getAllData();
		Map<Integer, Employee> employeesSorted=new TreeMap<>(employees);
		employeesSorted.keySet().forEach(key-> System.out.println("[Employee ID= "+key+" "+employees.get(key).getName()+"]"));
		System.out.print("\nSelect your choice: \n1.Add Employee\n2.Update Employee\n3.Delete Employee\nEnter: ");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			employees=addData();
			
			break;
		case 2:
			employees=updateData();
			break;
		case 3:
			employees=deleteData();
			break;
		default:
			System.out.println("Invalid choise!!\n");
			break;
		}
		
		System.out.println();
		employeeMethod();
	}

	

	

	

	
}
