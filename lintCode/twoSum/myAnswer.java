package twoSum;

import java.util.Arrays;

/**
 * ��һ���������飬�ҵ�������ʹ�����ǵĺ͵���һ����������target��
 * 
 * ����Ҫʵ�ֵĺ���twoSum��Ҫ���������������±�, ���ҵ�һ���±�С�ڵڶ����±ꡣע�������±�ķ�Χ��1��n��������0��ͷ��
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

	// ����������������е�
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
