package plusOne;

import java.util.Arrays;

public class others1 {
	public static void main(String[] args) {
		int[] digits = { 6, 2 };
		int[] result = plusOne(digits);
		System.out.println(Arrays.toString(result));
	}

	public static int[] plusOne(int[] digits) {
		int carries = 1;
		// fast break when carries equals zero
		for (int i = digits.length - 1; i >= 0 && carries > 0; i--) {
			int sum = digits[i] + carries;
			digits[i] = sum % 10;
			carries = sum / 10;
		}
		if (carries == 0)
			return digits;

		int[] rst = new int[digits.length + 1];
		rst[0] = 1;
		for (int i = 1; i < rst.length; i++) {
			rst[i] = digits[i - 1];
		}
		return rst;
	}
}
