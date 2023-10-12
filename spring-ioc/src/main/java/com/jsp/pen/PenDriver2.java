package com.jsp.pen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PenDriver2 {
	public static void main(String[] args) {
		//it support mark up language(<>) 
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		
		//directly thats why getbean() get it.
		Pen pen=	(Pen) applicationContext.getBean("myPen");
		pen.write();
		
	}

}
