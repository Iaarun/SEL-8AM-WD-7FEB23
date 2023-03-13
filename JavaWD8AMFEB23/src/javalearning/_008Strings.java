package javalearning;

public class _008Strings {
	
	public static void main(String[] args) {
		//using String literals
		String str = "Java";
		String str1 = "Java";
		
		// using new keyword
		String str2 = new String("Java");
		String str3 = new String("Java");
		
		if(str2==str) {
			System.out.println("same add");
		}else {
			System.out.println("diff add");
		}
	}

}
