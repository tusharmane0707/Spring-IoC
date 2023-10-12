package com.jsp.student.constructor.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class StudentDriver {
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		
		Student  student=	(Student) beanFactory.getBean("mystudent");
		student.studentDetails();
		
		
	}

}
/*
123
Mayur
mayur@mail.com
*/