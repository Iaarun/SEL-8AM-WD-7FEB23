package collectionDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapdemo {
	public static void main(String[] args) {
		iterateHashMap();
	}

	public static void hashMapBasic() {
		HashMap<String, Integer> marks;
		HashMap<Integer, Object> emp;

		HashMap<Integer, String> hmap = new HashMap<>();

		hmap.put(101, "test1");
		hmap.put(102, "test2");
		hmap.put(103, "test3");
		hmap.put(104, "test4");
		hmap.put(105, "test5");
		System.out.println(hmap);
		System.out.println(hmap.get(105));
		System.out.println(hmap.get(106));

		hmap.putIfAbsent(106, "test7");
		System.out.println(hmap);
		System.out.println(hmap.getOrDefault(107, "test8"));
		System.out.println(hmap);

		System.out.println(hmap.size());
		System.out.println(hmap.isEmpty());
		System.out.println(hmap.containsKey(107));
		System.out.println(hmap.containsValue("test7"));

		// hmap.clear();
		System.out.println(hmap.remove(106));
		System.out.println(hmap.remove(105, "test5"));
	}

	
	public static void iterateHashMap() {
		HashMap<Integer, String> hmap = new HashMap<>();

		hmap.put(101, "test1");
		hmap.put(102, "test2");
		hmap.put(103, "test3");
		hmap.put(104, "test4");
		hmap.put(105, "test5");
		
		System.out.println("===Iterate over keys only===");
		for(Integer x: hmap.keySet()) {
			System.out.println(x);
		}
		System.out.println("===Iterate over values only===");
		for(String x: hmap.values()) {
			System.out.println(x);
		}
		
		System.out.println("===Iterate over values only===");
		
		 Set<Entry<Integer, String>> set=hmap.entrySet();
		
		for(Map.Entry entry: set) {
			System.out.println(entry.getKey()+"|"+entry.getValue());
		}
		
	}
}
