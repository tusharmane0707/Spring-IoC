package com.jsp.pen;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDriver {
	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);	//it doesnot support mark up language(<>)
		
		//thats why we use 3rd party beanfactory
		Pen pen=(Pen) beanFactory.getBean("myPen");
		pen.write();
	}

}
