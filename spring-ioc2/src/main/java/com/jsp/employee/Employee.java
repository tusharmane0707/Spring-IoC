package com.jsp.employee;

public class Employee {
	
	private	int id;
	private	String emp_name;
	private	String emp_email;
	
	Employee() {
		System.out.println("Object created");
	}


	//nsm
	//setter injection 2nd method (direct xml through values pass)
	public void setId(int id) {
		this.id = id;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	
	public void employeeDetails() {
		System.out.println("Id of a Employee is " + id);
		System.out.println("Name of a Employee is " + emp_name);
		System.out.println("Email of a Employee is " + emp_email);
	}
	
	
	
	
}
