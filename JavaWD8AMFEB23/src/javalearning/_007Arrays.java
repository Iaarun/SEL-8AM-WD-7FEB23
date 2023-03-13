package javalearning;

import java.util.Arrays;
import java.util.Scanner;

public class _007Arrays {
	public static void main(String[] args) {
		_007Arrays ar = new _007Arrays();
		ar.twoDimensionalArray();
	}

	public void arrayBasic() {
//declaration of array
		int[] arr;
		// initialization of array
		arr = new int[5];

		int[] arr1 = new int[5];

		System.out.println(Arrays.toString(arr1));
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));

		// length of array
		System.out.println(arr1.length);

		// fetch data from array
		// System.out.println(arr1[0]);
		arr1[0] = 50;
		arr1[1] = 52;
		arr1[2] = 39;
		arr1[3] = 48;
		arr1[4] = 41;
		
		System.out.println(Arrays.toString(arr1));

		System.out.println(arr1[2]);
		
		Arrays.sort(arr1);

		System.out.println(Arrays.toString(arr1));
	}

	public void iterateoverarray() {
		int[] arr1 = new int[5];
		arr1[0] = 50;
		arr1[1] = 52;
		arr1[2] = 39;
		arr1[3] = 48;
		arr1[4] = 41;

		for (int i = 0; i <= arr1.length-1; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("=====");
		// enhance for loop
		for (int a : arr1) {
			System.out.println(a);
		}
	}
	
	public void runtimearr() {
		int [] arr1 = {45,21,61};
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = in.nextInt();
		
		System.out.println("Enter "+size+" elements in array");
		
		int arr[]= new int [size];
		

       for(int i=0; i<=size-1; i++) {
    	   arr[i]=in.nextInt();
       }
       
       System.out.println(Arrays.toString(arr));
       
       //copy data in second array
       int []arr2 =new int[size];
       
       for(int i=0; i<size; i++) {
    	   arr2[i]=arr[i];
       }
       
       System.out.println(Arrays.toString(arr2));
		
	}
	
    public void maxnumberinarray() {
    	int [] arr = {101,51,52,34,91,82};
    	
    	int max = arr[0];
    	int min = arr[0];
    	
    	for(int i=1; i<=arr.length-1; i++) {
    		if(max<arr[i]) {
    			max= arr[i];
    		}
    		
    		if(min>arr[i]) {
    			min= arr[i];
    		}
    	}
    	
    	System.out.println(max);
    	System.out.println(min);
    }
	
    
    public void twoDimensionalArray() {
    	//declaration of array
    	int[][]arr;
    	 arr= new int [3][3];
    	 
    	 System.out.println(arr);
    	 System.out.println(Arrays.toString(arr));
    	 
    	 arr[0][0]=15;
    	 arr[0][1]=16;
    	 arr[0][2]=17;
    	 arr[1][0]=51;
    	 arr[1][1]=52;
    	 arr[1][2]=53;
    	 arr[2][0]=71;
    	 arr[2][1]=72;
    	 arr[2][2]=73;
    	 
    	 for(int i=0; i<arr.length;i++) {
    		 for(int j=0; j<arr[0].length;j++) {
    			 System.out.print(arr[i][j]+" ");
    		 }
    		 System.out.println();
    	 }
    	 
    }

}
