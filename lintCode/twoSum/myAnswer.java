package twoSum;

import java.util.Arrays;

/**
 * 给一个整数数组，找到两个数使得他们的和等于一个给定的数target。
 * 
 * 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是1到n，不是以0开头。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 6, 6, 7, 11, 15 };
		System.out.println(Arrays.toString(twoSumSorted(numbers, 9)));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					return new int[] { i + 1, j + 1 };
				}
			}
		}
		return result;
	}

	// 如果数据是升序排列的
	public static int[] twoSumSorted(int[] numbers, int target) {
		int i = 0, j = numbers.length - 1;
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum == target) {
				break;
			} else if (sum > target) {
				j--;
			} else {
				i++;
			}
		}
		return new int[] { i + 1, j + 1 };
	}
}
