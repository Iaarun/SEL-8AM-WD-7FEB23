package javalearning;

/*
 Arithmetic
 assignment 
 comparison
 logical operators
 ternary
 bitwise
 */
public class _003Operators {
	public static void main(String[] args) {
		_003Operators op = new _003Operators();
		op.findLargestOfThreeNumbers();
	}

	public void assignmentoperator() {
		// =

		int a = 10;
		int b = a;
	}

	public void arithmeticoperator() {
		// + - * / %

		int a = 10;
		int b = 3;
		System.out.println(a + b);// 13
		System.out.println(a - b);// 7
		System.out.println(a * b);// 30
		System.out.println(a / b);// 3
		System.out.println(a % b);// 1
	}

	public void comparisonoperator() {
		// ==, !=, > < <= <=

		int a = 10;
		int b = 3;

		System.out.println(a > b);// true
		System.out.println(a < b);// false
		System.out.println(a == b);// false
		System.out.println(a != b);// true
		System.out.println(a >= b);// true
		System.out.println(a <= b);// false

	}

	public void logicaloperators() {
		// && ||
		int a = 10;
		int b = 5;
		int c = 15;
		System.out.println((a < b) && (c > b));// false
		System.out.println((a < b) || (c < b));// true
	}

	public void ternaryOperator() {
		// (condition)?expression1:expression2;
		int a = 10;
		int b = 15;

		int result = (a > b) ? (a + b) : (a * b);
		System.out.println(result);

	}

	public void findLargestOfThreeNumbers() {
		int a = 205, b = 50, c = 135;

		int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println(max);
	}
}
