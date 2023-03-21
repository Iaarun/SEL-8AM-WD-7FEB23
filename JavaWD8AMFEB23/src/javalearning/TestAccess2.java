package javalearning;

import classesandobjects.AccessModifiers;

public class TestAccess2 extends AccessModifiers {
	
	public static void main(String[] args) {
		AccessModifiers am2 = new AccessModifiers();
		
		TestAccess2 ta2 = new TestAccess2();
		ta2.test1();
		ta2.test2();
		
		AccessModifiers.test5();
	}

}
