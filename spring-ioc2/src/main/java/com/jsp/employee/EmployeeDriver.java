package com.jsp.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class EmployeeDriver {
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		
		Employee employee=	(Employee) beanFactory.getBean("myEmployee");
		
		//1 method object through pass values
//		employee.id=1234;
//		employee.emp_name="Rohit";
//		employee.emp_email="rohit@mail.com";
//		
		
		employee.employeeDetails(); //setter method injection
			
	}

}
/*
Object created
Id of a Employee is 1234
Name of a Employee is Rohit
Email of a Employee is rohit@mail.com
*/