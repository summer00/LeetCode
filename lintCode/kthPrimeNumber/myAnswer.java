package kthPrimeNumber;

import java.util.ArrayList;

/**
 * 设计一个算法，找出只含素因子3，5，7 的第 k 大的数。符合条件的数如：3，5，7，9，15......
 * 
 * 解题思路：http://www.cppblog.com/zenliang/articles/131094.html
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(kthPrimeNumber(1111));
		long a = Long.parseLong("221475379545");
		System.out.println(kthPrimeNumber(1111) == a);
	}

	public static long kthPrimeNumber(int k) {
		int num3 = 0, num5 = 0, num7 = 0;
		long[] nums = new long[k + 1];
		nums[0] = 1;
		for (int i = 1; i <= k; i++) {
			nums[i] = min(nums[num3] * 3, nums[num5] * 5, nums[num7] * 7);
			if (nums[i] == nums[num3] * 3) {
				num3++;
			}
			if (nums[i] == nums[num5] * 5) {// 这里不能用else if，因为可能有两个最小值，这时都要挪动；
				num5++;
			}
			if (nums[i] == nums[num7] * 7) {
				num7++;
			}
		}
		return nums[k];
	}

	private static long min(long a, long b, long c) {
		long result = a;
		if (result > b) {
			result = b;
		} else if (result > c) {
			result = c;
		}
		return result;
	}
}
