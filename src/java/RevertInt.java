
public class RevertInt {

	public static void main(String[] args) {
		int invertedNumber = revert(1234);
		System.out.println(invertedNumber);
	}

	private static int revert(int number) {
		int revertedNumber = 0;
		while (number > 0) {
			// mod 10 to get the last digit
			int lastDigit = number % 10;
			// add second digit
			revertedNumber = revertedNumber * 10 + lastDigit;
			// divide original number to remove last digit
			number = number / 10;
		}
		return revertedNumber;
	}
}
