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
		op.comparisonoperator();
	}
	
	public void assignmentoperator() {
		// =
		
		int a = 10;
		int b = a;
	}
	
	public void arithmeticoperator() {
		// + - * / %
		
		int a=10; 
		int b = 3;
		System.out.println(a+b);//13
		System.out.println(a-b);//7
		System.out.println(a*b);//30
		System.out.println(a/b);//3
		System.out.println(a%b);//1
	}
	
	public void comparisonoperator() {
		// ==, !=, > < <=   <=
		
		int a=10; 
		int b = 3;
		
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
	
	}
}
