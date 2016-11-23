
/**
 * Question 5 An array contains n numbers ranging from 0 to n-2. There is
 * exactly one number duplicated in the array. How do you find the duplicated
 * number? For example, if an array with length 5 contains numbers {0, 2, 1, 3,
 * 2}, the duplicated number is 2.
 * 
 * Question 6 An array contains n numbers * ranging from 0 to n-1. There are
 * some numbers duplicated in the array. It is not clear how many numbers are
 * duplicated or how many times a number gets duplicated. How do you find a
 * duplicated number in the array? For example, if an array of length 7 contains
 * the numbers {2, 3, 1, 0, 2, 5, 3}, the implemented function (or method)
 * should return either 2 or 3.
 */
public class FindDuplicates {

	public static void main(String[] args) {
		int numbersQuestion5[] = { 0, 2, 1, 3, 2 };
		System.out.println(duplicate(numbersQuestion5));
		int numbersQuestion6[] = { 2, 3, 1, 0, 2, 5, 3 };
		System.out.println(duplicate(numbersQuestion6));
	}

	static int duplicate(int numbers[]) {
		int length = numbers.length;
		for (int i = 0; i < length; i++) {
			if (numbers[i] < 0 || numbers[i] > length - 1) {
				throw new IllegalArgumentException("invalid number");
			}
			if (numbers[i] != i) {
				if (numbers[i] == numbers[numbers[i]]) {
					return numbers[i];
				}

				int tmp = numbers[i];
				numbers[i] = numbers[tmp];
				numbers[tmp] = tmp;
			}
		}
		throw new IllegalArgumentException("no dups");
	}

}
