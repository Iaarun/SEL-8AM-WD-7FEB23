package classesandobjects;

public class Calculator {
	
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		calc.add();
	}
	
	// accessmodifier static/nonstatic returntype identifier(){ }
	
	/*
	  non parameterized method
	  parameterized method
	 */
	
	public void add() {
		int a =50, b=20;
		System.out.println(a+b);
	}
	
	
	public void add (int a, int b) {
		System.out.println(a+b);
	}

}
