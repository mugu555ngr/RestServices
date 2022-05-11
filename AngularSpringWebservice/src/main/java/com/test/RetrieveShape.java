package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class RetrieveShape {
	
	Shape s1;
	
	RetrieveShape(@Qualifier("triangle") Shape shape) {
		s1 = shape;
	}
	
	public static void main(String args[]) {
		
		// Without Spring
		Shape s = new Triangle();
		s.getSize();
		
		// Spring
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		RetrieveShape retrieveShape = applicationContext.getBean(RetrieveShape.class);
		retrieveShape.s1.getSize();
	}
}
