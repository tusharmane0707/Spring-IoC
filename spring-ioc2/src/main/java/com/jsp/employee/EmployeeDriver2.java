package com.jsp.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class EmployeeDriver2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		Employee  employee=	(Employee) applicationContext.getBean("myEmployee");
		employee.employeeDetails();
	}

}




/*
Object created	// application context load all abjects
Id of a Employee is 1234
Name of a Employee is Rohit
Email of a Employee is rohit@mail.com
*/