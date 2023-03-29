package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
Hashset does not allows user to store duplicate data
Hashset does not maintain the insertion order
*/
public class HashSetDemo {
	public static void main(String[] args) {
		HashSetDemo hd = new HashSetDemo();
		hd.iterateHashSet();
	}

	public void hashsetbasic() {
		// does not maintain insertion order
		// HashSet<String> hset = new HashSet<>();

		// maintain the insertion order
		// LinkedHashSet<String> hset = new LinkedHashSet<>();

		// maintain data in natural order
		TreeSet<String> hset = new TreeSet<>();
		hset.add("Test1");
		hset.add("Test3");
		hset.add("Test5");
		hset.add("Test4");
		hset.add("Test2");
		hset.add("Test2");

		System.out.println(hset);
		System.out.println(hset.size());
		System.out.println(hset.contains("Test6"));
		System.out.println(hset.isEmpty());

	}

	public void iterateHashSet() {
		HashSet<String> hset = new HashSet<>();
		hset.add("Test1");
		hset.add("Test3");
		hset.add("Test5");
		hset.add("Test4");
		hset.add("Test2");
		hset.add("Test2");
		
		System.out.println("===using enhance for loop===");
		for(String x: hset) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("===using foreach function with lambda===");
		
		hset.forEach(x->{
			System.out.print(x+" ");
		});
		
		System.out.println();
		System.out.println("===using stream api===");
		
		hset.stream().forEach(x->{
			System.out.print(x+" ");
		});
		
		System.out.println();
		System.out.println("===using iterator===");
		
		 Iterator<String> it=hset.iterator();
		 while(it.hasNext()) {
			 System.out.print(it.next()+" ");
		 }
	}

}
