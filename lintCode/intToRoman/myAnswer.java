package intToRoman;

/**
 * 整数转罗马数字
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(intToRoman(14));
	}

	public static String intToRoman(int n) {
		String[][] roman = { { "", "I", "II", "III", "VI", "V", "IV", "IIV", "IIIV", "XI" },
				{ "", "X", "XX", "XXX", "LX", "L", "XL", "XXL", "XXXL", "CX" },
				{ "", "C", "CC", "CCC", "DC", "D", "CD", "CCD", "CCCD", "MC" }, { "", "M", "MM", "MMM" } };

		StringBuffer ret = new StringBuffer();
		int digit = 0;
		while (n != 0) {
			int remain = n % 10;
			ret.append(roman[digit][remain]);
			digit++;
			n /= 10;
		}

		return ret.reverse().toString();
	}
}
