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
 * һ��������λ�洢��һ��int�����У�����˳��Ϊ�����λ��array[0] �����λ��[n-1]�����磺98���洢Ϊ��array[0]=9;
 * array[1]=8;
 *
 */
public class myAnwser {
	public static void main(String[] args) {
		int[] result = plusOne(new int[] { 8, 9 });
		System.out.println(Arrays.toString(result));
	}

	// �Ľ�����Ϊֻ��1���ʲ����ܴ���10
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

	// �Ľ�,270ms
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

	// ��һ��ʵ�֣�500ms
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
