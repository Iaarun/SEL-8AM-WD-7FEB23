package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/*
  remove duplicate from the array
  arr=[12,15,64,64,15,12,34,94]
 */
public class TestPractice {
	public static void main(String[] args) {
		maxMin();
	}

	public static void removeduolicate() {
		Integer[] arr = { 12, 15, 64, 64, 15, 12, 34, 94 };

		List<Integer> li = Arrays.stream(arr).collect(Collectors.toList());

		System.out.println(li.toString());
		HashSet<Integer> hset = new HashSet<>(li);
		System.out.println(hset.toString());

		List<Integer> li2 = Arrays.stream(arr).distinct().collect(Collectors.toList());
		System.out.println(li2);

		List<Integer> li3 = new ArrayList<>();

		for (Integer a : li) {
			if (!li3.contains(a)) {
				li3.add(a);
			}
		}

		System.out.println(li3);

		// max from a list
		List<Integer> li4 = Arrays.stream(arr).limit(2).collect(Collectors.toList());
		System.out.println(li4);
	}

	public static void maxMin() {
		Integer[] arr = { 12, 15, 64, 64, 15, 12, 34, 94 };
		List<Integer> li = Arrays.stream(arr).collect(Collectors.toList());

		int max = li.get(0);
		for (int i = 0; i <= li.size() - 1; i++) {
			if (li.get(i) > max) {
				max = li.get(i);
			}
		}
		System.out.println(max);

		Integer max1 = li.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max1);

		Integer min1 = li.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min1);
	}

}
