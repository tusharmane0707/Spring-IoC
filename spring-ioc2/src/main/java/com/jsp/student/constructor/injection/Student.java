package com.jsp.student.constructor.injection;

public class Student {
	int id;
	String name;
	String email;
	
	//constructor injection we can pass values in xml(constructor-args) tag using 
	Student(int id,String name,String email){
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public void studentDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
	}

}
