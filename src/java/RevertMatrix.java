import java.util.Arrays;

/** 
 * Given a matrix such as
 *  1 2 3 
 *  4 5 6
 *  7 8 9
 * Revert the items inside the matrix
 */ 
public class RevertMatrix {
	
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		printMatrix(revert(matrix));
	}

	private static int[][] revert(int[][] matrix) {
		int totalRows = matrix.length;
		int totalCols = matrix[0].length;
		for (int rowIndex = 0; rowIndex <= totalRows / 2; rowIndex++) {
			for (int colIndex = 0; colIndex < totalCols; colIndex++) {
				int firstItem = matrix[rowIndex][colIndex];
				int lastItem = matrix[totalRows - rowIndex - 1][totalCols - colIndex - 1];
				if(firstItem == lastItem) break;
				matrix[rowIndex][colIndex] = lastItem;
				matrix[totalRows - rowIndex - 1][totalCols - colIndex - 1] = firstItem;
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {
		Arrays.stream(matrix).forEach((row) -> {
			System.out.print("[");
			Arrays.stream(row).forEach((el) -> System.out.print(" " + el + " "));
			System.out.println("]");
		});
	}
}
