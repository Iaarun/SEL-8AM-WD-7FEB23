package polymorphismdemo;

public class Calculator {

	public void add() {
		int a = 10, b = 20;
		System.out.println(a + b);
	}

	// changing the number of parameter
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// changing the type of parameter
	public void add(int a, double b) {
		System.out.println(a + b);
	}

	// changing the sequence of parameter
	public void add(double a, int b) {
		System.out.println(a + b);
	}

	private static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	public static void main(String[] args) {

	}
	
	public static void main(int[] args) {
		
	}
}
