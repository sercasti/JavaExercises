
public class ColumnToNumber {

	public static int titleToNumber(String s) {
		if (s == null || s.length() == 0) {
			throw new IllegalArgumentException("Input is not valid!");
		}

		int result = 0;
		int i = s.length() - 1;
		int t = 0;
		while (i >= 0) {
			char curr = s.charAt(i);
			result = result + (int) Math.pow(26, t) * (curr - 'A' + 1);
			t++;
			i--;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(titleToNumber("CC"));
		System.out.println(NumberToTitle(81));
	}

	private static String NumberToTitle(int number) {
		final StringBuilder sb = new StringBuilder();

        int num = number - 1;
        while (num >=  0) {
            int numChar = (num % 26)  + 65;
            sb.append((char)numChar);
            num = (num  / 26) - 1;
        }
        return sb.reverse().toString();
	}
}
