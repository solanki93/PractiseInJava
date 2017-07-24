package com.practise.dataStructure.matrix;

public class SearchInRowWiseAndColumnWiseSortedMatrix {

	public static void search(int[][] matrix, int n, int key) {

		int i = 0;
		int j = n - 1;

		while (i < n && j >= 0) {

			if (matrix[i][j] == key) {

				System.out.println("Key = " + key + " found.");
				return;
			}
			if (key > matrix[i][j]) {
				i++;
			} else {
				j--;
			}
		}
		System.out.println("Key = " + key + " not found.");
	}
}
