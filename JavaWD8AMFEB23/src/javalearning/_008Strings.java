package javalearning;

public class _008Strings {
	
	public static void main(String[] args) {
		_008Strings strobj = new _008Strings();
		strobj.basicStringMethods();
		
	}
	
	public void basicStringMethods() {
		String str="Java";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(str.length()-1));
		
		System.out.println(str.contains("av"));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("a"));
		
		str="Java";
		String str1 = "Java";
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str1.compareTo(str));
		
		
		
		str=" ";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		
		str = "Java Test";
		
		System.out.println(str.length());
		System.out.println(str);
		System.out.println(str.trim());
		
		
		System.out.println(str.replace(" ", "--"));
		
		System.out.println(str.substring(4));
		System.out.println(str.substring(3,7));
		
	//I/P= xyz@gmail.com	 O/P=xyz48485ADWF
		
		String email = "xyz@gmail.com";
		
		System.out.println(email.substring(0, email.indexOf("@")));
		
		
		
		
		
		
		
		
	}
	
	public void stringcreate() {
		//using String literals
		String str = "Java";
		String str1 = "Java";
		
		// using new keyword
		String str2 = new String("Java");
		String str3 = new String("Java");
		
//		if(str2==str) {
//			System.out.println("same add");
//		}else {
//			System.out.println("diff add");
//		}
		
	    str=str.concat(" Test");
		System.out.println(str);
	//	System.out.println(nstr);
	}
	
	

}
