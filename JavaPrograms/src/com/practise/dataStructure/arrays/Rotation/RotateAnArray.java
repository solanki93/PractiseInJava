package com.practise.dataStructure.arrays.Rotation;

/*
 * Rotate an array by d elements
 */
public class RotateAnArray {

	public static void rotateArray(int[] arr,int d, int n) {
		
		int i = 0;
		int j = d;
		int temp = 0;
		
		//Reverse array from 0 to d
		while( i < j) {
			
			temp = arr[i];
			arr[i] = arr[j-1];
			arr[j-1] = temp;
			i++;
			j--;
		}
		
		// Reverse array from d to n
		i = d;
		j = n;
		while(i < j) {
			
			temp = arr[i];
			arr[i] = arr[j-1];
			arr[j-1] = temp;
			i++;
			j--;
		}
		
		//Now Reverse the entire array
		i = 0 ;
		j = n;
		while(i < j) {
			
			temp = arr[i];
			arr[i] = arr[j-1];
			arr[j-1] = temp;
			i++;
			j--;
		}
		
	}
}
