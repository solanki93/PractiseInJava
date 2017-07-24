package com.practise.dataStructure.arrays.Rotation;
import com.practise.dataStructure.arrays.Rotation.RotateAnArray;
import com.practise.dataStructure.arrays.ArraysUtils;

public class RotateAnArrayTest {

	public static void main(String[] args) {
		
		int[] arr1 = ArraysUtils.generateArrayFromAToB(1, 10);
		RotateAnArray.rotateArray(arr1, 2, arr1.length);
		ArraysUtils.printArray(arr1, arr1.length);
		
		arr1 = ArraysUtils.generateArrayFromAToB(1, 20);
		RotateAnArray.rotateArray(arr1, 10, arr1.length);
		ArraysUtils.printArray(arr1, arr1.length);

		arr1 = ArraysUtils.generateArrayFromAToB(1, 10);
		RotateAnArray.rotateArray(arr1, 9, arr1.length);
		ArraysUtils.printArray(arr1, arr1.length);
		
		arr1 = ArraysUtils.generateArrayFromAToB(1, 10);
		RotateAnArray.rotateArray(arr1, 10, arr1.length);
		ArraysUtils.printArray(arr1, arr1.length);
	}
}
