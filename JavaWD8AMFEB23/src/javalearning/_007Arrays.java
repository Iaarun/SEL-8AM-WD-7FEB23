package javalearning;

import java.util.Arrays;

public class _007Arrays {
	public static void main(String[] args) {
		_007Arrays ar = new _007Arrays();
		ar.arrayBasic();
	}
	
	public void arrayBasic() {
//declaration of array
		int[] arr;
		//initialization of array
		arr = new int[5];
		
		int [] arr1 = new int[5];
		
		System.out.println(Arrays.toString(arr1));
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		//length of array
		System.out.println(arr1.length);
		
		//fetch data from array
		System.out.println(arr1[0]);
		
	}

}
