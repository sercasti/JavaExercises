import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * implement two methods, and add(int value), and a bool check(int result), the
 * add method should simply save the values that are sent the check method
 * should return if the sum of two values on the array are equals to the given
 * parameter
 * 
 * @author sercasti
 */
public class TwoSumsProblem {

	Set<Integer> values = new HashSet<Integer>();

	public static void main(String[] args) {
		TwoSumsProblem problem = new TwoSumsProblem();
		problem.add(1, 3, 4, 6, 8, 15);
		System.out.println("Rock and roll? " + problem.check(9));
	}

	private void add(Integer... newValues) {
		values.addAll(Arrays.asList(newValues));
	}

	private boolean check(int result) {
		for (Integer value : values) {
			int difference = result - value.intValue();
			if (values.contains(difference)) {
				return true;
			}
		}
		return false;
	}
}
