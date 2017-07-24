package com.practise.dataStructure.arrays;

public class ArraysUtils {

	public static int[] generateArrayFromAToB(int a,int b ) {
		
		int[] arr = new int[b-a+1];
		int j = 0;
		
		for(int i = a ; i <= b ;i++) {
			
			arr[j++] = i;
		}
		return arr;
	}
	
	public static void printArray(int[] arr,int n) {
		
		for(int i = 0 ; i < n ;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
