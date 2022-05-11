package com.test;

public class Test1 extends TestParent {

	Test1() {
		System.out.println("Test1 constructor");
	}
	
	public static void main(String args[]) {
		Test1 test1 = new Test1();
	}
}

class TestParent {
	TestParent() {
		System.out.println("Test Parent constructor");
	}
}
