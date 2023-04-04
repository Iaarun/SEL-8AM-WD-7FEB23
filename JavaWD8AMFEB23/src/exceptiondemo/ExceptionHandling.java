package exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		testexception();
		
		File file = new File("");
		
//		try {
//			FileInputStream fis = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public static void testexception() {
		System.out.println("Programm Started");
		int [] arr= {12,31,51,62,34};
		try {
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("Programm Ends");
	}
	
	
	public void complietimeexceptions() throws FileNotFoundException {
		File file = new  File("");
		FileInputStream fis = new FileInputStream(file);
	}
	
	

}
