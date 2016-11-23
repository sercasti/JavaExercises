
/**
 * Question 7 In a 2-D matrix, every row is increasingly sorted from left to
 * right, and the last number in each row is not greater than the first number
 * of the next row. Please implement a function to check whether a number is in
 * such a matrix or not. It returns true if it tries to find the number 7 in the
 * sample matrix, but it returns false if it tries to find the number 12.
 */
public class FindNumberInMatrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5 }, { 7, 9, 11 }, { 13, 15, 17 } };
		System.out.println(find(matrix, 7));
		System.out.println(find(matrix, 12));
	}

	static boolean find(int matrix[][], int value) {

		int rows = matrix.length;
		int cols = matrix[0].length;
		int end = rows * cols - 1;
		int start = 0;
		while (start <= end) {
			int medium = start + (end - start) / 2;
			int col = medium % cols;
			int row = medium / rows;
			int mediumValue = matrix[row][col];

			if (mediumValue == value)
				return true;
			if (mediumValue < value)
				start = medium + 1;
			else
				end = medium - 1;
		}
		return false;
	}
}
