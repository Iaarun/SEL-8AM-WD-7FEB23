package javalearning;

import java.util.Scanner;

public class _004UserInput {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// integer input
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		System.out.println("Enter String data");
		String str = sc.next();
		System.out.println("Enter boolean data");
		boolean flag = sc.nextBoolean();
		System.out.println("Enter decimal data");
		 double dvar= sc.nextDouble();
		 System.out.println("Enter any character");
		 char ch= sc.next().charAt(0);
		 
		 System.out.println(num);
		 System.out.println(str);
		 System.out.println(flag);
		 System.out.println(dvar);
		 System.out.println(ch);
		 
	}
}
