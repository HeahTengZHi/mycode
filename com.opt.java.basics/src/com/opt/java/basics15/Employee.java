package com.opt.java.basics15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
	private SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
	int id;
	String name;
	Date date;
	//Constructor
	Employee(int id,String name,String date){
		this.id=id;
		this.name=name;
		//Date
		try {
			this.date=df.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name +", date="+df.format(date)+ "]";
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
