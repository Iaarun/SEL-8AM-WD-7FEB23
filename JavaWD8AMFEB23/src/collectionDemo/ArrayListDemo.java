package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayListDemo ad = new ArrayListDemo();
		ad.listIterate();
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
		li.add("Test2");
		
		System.out.println(li);
		
	System.out.println(li.size());
	
	System.out.println(li.get(2));
	li.add(0,"Test6");
	System.out.println(li);
	li.set(li.size()-1, "Test7");
	System.out.println(li);
	
//	li.clear();
//	System.out.println(li);	
	System.out.println(li.remove(li.size()-1));
	
	System.out.println(li);
	System.out.println(li.remove("Test9"));
	System.out.println(li);
	
	System.out.println(li.contains("Test2"));
	
	//sorting the list
	Collections.sort(li);
	//sorting the list in reverse order
	Collections.sort(li, Collections.reverseOrder());
	System.out.println(li);
	
	 System.out.println(li.indexOf("Test2"));
	 System.out.println(li.lastIndexOf("Test2"));
	 
	System.out.println(li.subList(1, 5));
	
      Object li2=	li.clone();
      
      String [] arr= {"arr1", "arr2", "arr3"};
      
     List<String> li3=  Arrays.asList(arr);
     
     System.out.println(li3);
     
     li.addAll(0,li3);
     System.out.println(li);
     li.removeAll(li3);
     System.out.println(li);
	
	}

	
	public void listIterate() {
		/*
		  we can iterate by 7 ways
		  for loop, while loop, enhance for loop, foreach function, stream
		  iterator, listiterator
		 */
		ArrayList<String> li = new ArrayList(0);
		li.add("Test1");
		li.add("Test3");
		li.add("Test5");
		li.add("Test4");
		li.add("Test2");
		
		
	
		System.out.println("===using for loop===");
		for(int i=0; i<=li.size()-1; i++) {
			System.out.print(li.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("===Using while loop===");
		int i=0;
		while(i<=li.size()-1) {
			System.out.print(li.get(i)+" ");
			i++;
		}
		System.out.println();
		System.out.println("===Using enhance for loop===");
		
		for(String a: li) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		System.out.println("===Using foreach function with lambda ===");
		
		li.forEach(a->{
			System.out.print(a+" ");
		});
		
		
		System.out.println();
		System.out.println("===Using stream api===");
		
		li.stream().forEach(a->{
			System.out.print(a+" ");
		});
		
		System.out.println();
		System.out.println("===Using Iterator===");
		
		 Iterator<String> it=  li.iterator();
		 
		 while(it.hasNext()) {
			 System.out.print(it.next()+" ");
		 }
		
		
		 System.out.println();
		System.out.println("===Using list Iterator===");
		
		  ListIterator<String> listit= li.listIterator();
		  
		  while(listit.hasPrevious()) {
			  System.out.print(listit.previous()+" ");
		  }
		
	}
}
