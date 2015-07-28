package threeSumClosest;

import java.util.Arrays;

/**
 * 给一个包含n个整数的数组S, 找到和与给定整数target最接近的三元组，返回这三个数的和。
 * http://blog.csdn.net/li4951/article/details/8693212
 * http://blog.csdn.net/salutlu/article/details/25986239
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		System.out.println(threeSumClosest(numbers, 3));
	}

	// TODO: 过滤重复
	public static int threeSumClosest(int[] numbers, int target) {
		int result = 0, min = Integer.MAX_VALUE;
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 2; i++) {
			int j = i + 1, k = numbers.length - 1;
			while (j < k) {
				int sum = numbers[i] + numbers[j] + numbers[k];
				int diff = Math.abs(sum - target);
				if (diff == 0) {
					return sum;
				}
				if (diff < min) {
					min = diff;
					result = sum;
				}
				if (sum > target) {
					k--;
				} else if (sum < target) {
					j++;
				}
			}
		}
		return result;
	}
}
