package com.practise.dataStructure.matrix;

import com.practise.dataStructure.matrix.SearchInRowWiseAndColumnWiseSortedMatrix;;

public class SearchInRowWiseAndColumnWiseSortedMatrixTest {

	public static void main(String[] args) {
		
		
		int[][] matrix1 = { {10, 20, 30, 40},
			                {15, 25, 35, 45},
			                {27, 29, 37, 48},
			                {32, 33, 39, 50},
			              	};	
		
		SearchInRowWiseAndColumnWiseSortedMatrix.search(matrix1, matrix1.length, 37);
		SearchInRowWiseAndColumnWiseSortedMatrix.search(matrix1, matrix1.length, 15);
		SearchInRowWiseAndColumnWiseSortedMatrix.search(matrix1, matrix1.length, 29);
		SearchInRowWiseAndColumnWiseSortedMatrix.search(matrix1, matrix1.length, 0);
	}
}
