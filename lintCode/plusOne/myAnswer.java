package plusOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ¼ÓÒ»
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] digits = { 6, 2 };
		int[] result = plusOne1(digits);
		System.out.println(Arrays.toString(result));
	}

	public static int[] plusOne1(int[] digits) {
		boolean isCarry = false;
		int[] result = new int[digits.length];
		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1 || isCarry) {
				if (digits[i] == 9) {
					result[i] = 0;
					isCarry = true;
				} else {
					result[i] = digits[i] + 1;
					isCarry = false;
				}
			} else {
				result[i] = digits[i];
			}
		}
		if (isCarry) {
			int[] result1 = new int[result.length + 1];
			for (int i = 0; i < result.length; i++) {
				result1[i + 1] = result[i];
			}
			result1[0] = 1;
			return result1;
		}
		return result;
	}

	public static int[] plusOne(int[] digits) {
		List<Integer> list = new ArrayList<>();
		boolean isCarry = false;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (i == digits.length - 1 || isCarry) {
				if (digits[i] == 9) {
					list.add(0);
					isCarry = true;
				} else {
					list.add(digits[i] + 1);
					isCarry = false;
				}
			} else {
				list.add(digits[i]);
			}
		}
		if (isCarry) {
			list.add(1);
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[list.size() - 1 - i] = list.get(i);
		}
		return result;
	}
}
