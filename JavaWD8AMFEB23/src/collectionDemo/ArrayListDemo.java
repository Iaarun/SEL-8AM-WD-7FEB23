package collectionDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayListDemo ad = new ArrayListDemo();
		ad.arraylistbasic();
	}
	
	public void arrayBasic() {
		int [] arr = new int [10];
	}
	
	public void wrapperclassesdemo() {
		/*
		 Wrapper class is used to convert primitive to object 
		 and object to primitive
		 */
		
		int a=10;
		//Autoboxing
		Integer i1 = new Integer(a);
		
		//unboxing
		int i2 = i1;
	}
	
	
	public void arraylistbasic() {
		
		//initial capacity of array list is 16
	//	String s = new String();
		ArrayList<String> li = new ArrayList(0);
		li.add("Test1");
		li.add("Test3");
		li.add("Test5");
		li.add("Test4");
		li.add("Test2");
		li.add("Test2");
		
		System.out.println(li);
		
	System.out.println(li.size());
	
	System.out.println(li.get(2));
	li.add(0,"Test6");
	System.out.println(li);
	li.set(li.size()-1, "Test7");
	System.out.println(li);
		
	}

}
