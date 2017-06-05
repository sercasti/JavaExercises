import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * implement two methods, and add(int value), and a bool check(int result), 
 * the add method should simply save the values that are sent 
 * the check method should return if the sum of two values on the array are equals to the given
 * parameter
 * 
 * @author sercasti
 */
public class SumsArrayChecker {

	List<Integer> array = new ArrayList<Integer>();
	Set<Integer> results = new HashSet<Integer>();

	public static void main(String[] args) {
		SumsArrayChecker sumsArrayChecker = new SumsArrayChecker();
		sumsArrayChecker.add(1, 2, 2, 6);
		System.out.println(sumsArrayChecker.check(4));
		System.out.println(sumsArrayChecker.check(8));
		System.out.println(sumsArrayChecker.check(12));
	}

	
	//o(n)
	private void add(Integer... values) {
		for (Integer thisValue : values) {
			for (Integer existingValue : array) {
				results.add(thisValue + existingValue);
			}
			array.add(thisValue);
		}
	}

	//o(1)
	private boolean check(int result) {
		return results.contains(result);
	}
}
