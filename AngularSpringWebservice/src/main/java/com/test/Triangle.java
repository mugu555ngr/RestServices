package com.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("triangle")
public class Triangle implements Shape {

	@Override
	public void getSize() {
		System.out.println("Triangle size : 3");
		
	}

}
