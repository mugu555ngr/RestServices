package com.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("rectangle")
public class Rectangle implements Shape {

	@Override
	public void getSize() {
		System.out.println("Rectangle size :"+4);
		
	}

}
