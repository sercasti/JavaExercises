import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * A robot is asked to navigate a maze. It is placed at a certain position (the
 * starting position) in the maze and is asked to try to reach another position
 * (the goal position). Positions in the maze will either be open or blocked
 * with an obstacle. Positions are identified by (x,y) coordinates.
 */

public class Maze {

	static char[][] matrix = { { '.', '#', '#', '#', '#', '#' }, 
			                   { '.', '.', '.', '.', '.', '#' },
							   { '#', '.', '#', '#', '#', '#' }, 
							   { '#', '.', '#', '#', '#', '#' }, 
							   { '.', '.', '.', '#', '.', 'G' },
			                   { '#', '#', '.', '.', '.', '#' } };

	public static void main(String[] args) {
		int startx = 0, starty = 0;
		findPath(startx, starty);
		printMatrix(matrix);
	}

	private static boolean findPath(int x, int y) {

		if (x < 0 || y < 0 || x > matrix.length || y > matrix[0].length) //out of bounds
			return false;
		if (matrix[x][y] == 'G') //Goal found
			return true;
		if (matrix[x][y] == '#' || matrix[x][y] == '+' ) //Blocked or already marked
			return false;
		matrix[x][y] = '+'; //mark as solution path

		if (findPath(x - 1, y) == true) return true; //Try north
		if (findPath(x, y + 1) == true) return true; //Try East
		if (findPath(x + 1, y) == true) return true; //Try South
		if (findPath(x, y - 1) == true) return true; //Try west
		matrix[x][y] = '#'; //Mark as wrong path
		return false;
	}
	
	private static void printMatrix(char[][] matrix) {
		Arrays.stream(matrix).forEach(row -> {
			System.out.print("[");
			Stream<Character> cStream = IntStream.range(0, row.length).mapToObj(i -> row[i]);
			cStream.forEach((el) -> System.out.print(" " + el + " "));
			System.out.println("]");
		});
	}

}
