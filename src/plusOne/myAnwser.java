package plusOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * Given a non-negative number represented as an array of digits, plus one
 * to the number.
 * 
 * The digits are stored such that the most significant digit is at the head
 * of the list.
 * 
 * 一个整数按位存储于一个int数组中，排列顺序为：最高位在array[0] ，最低位在[n-1]，例如：98，存储为：array[0]=9;
 * array[1]=8;
 *
 */
public class myAnwser {
	public static void main(String[] args) {
		int[] result = plusOne(new int[] { 8, 9 });
		System.out.println(Arrays.toString(result));
	}

	// 改进：因为只加1，故不可能大于10
	public static int[] plusOne(int[] digits) {
		int length = digits.length - 1;
		int[] result = new int[length + 2];
		digits[length]++;
		for (int i = length; i >= 0; i--) {
			if (digits[i] == 10) {
				result[i + 1] = 0;
				result[i]++;
			} else {
				result[i + 1] += digits[i];
				if (result[i + 1] == 10) {
					result[i + 1] = 0;
					result[i]++;
				}
			}
		}
		if (result[0] == 0) {
			return Arrays.copyOfRange(result, 1, result.length);
		}
		return result;
	}

	// 改进,270ms
	public static int[] plusOne2(int[] digits) {
		int length = digits.length - 1;
		int[] result = new int[length + 2];
		digits[length]++;
		for (int i = length; i >= 0; i--) {
			if (digits[i] >= 10) {
				result[i + 1] = digits[i] % 10;
				result[i]++;
			} else {
				result[i + 1] += digits[i];
				if (result[i + 1] >= 10) {
					result[i + 1] = result[i + 1] % 10;
					result[i]++;
				}
			}
		}
		if (result[0] == 0) {
			return Arrays.copyOfRange(result, 1, result.length);
		}
		return result;
	}

	// 第一次实现，500ms
	public static int[] plusOne1(int[] digits) {
		List<Integer> list = new ArrayList<Integer>();
		int length = digits.length - 1;
		digits[length]++;
		for (int i = length; i >= 0; i--) {
			if (digits[i] >= 10) {
				digits[i] = digits[i] % 10;
				list.add(digits[i]);
				if (i != 0) {
					digits[i - 1]++;
				} else {
					list.add(1);
				}
			} else {
				list.add(digits[i]);
			}
		}
		Collections.reverse(list);
		return list.stream().mapToInt(i -> i).toArray();
	}

}
