package kthPrimeNumber;

import java.util.ArrayList;

/**
 * ���һ���㷨���ҳ�ֻ��������3��5��7 �ĵ� k ��������������������磺3��5��7��9��15......
 * 
 * ����˼·��http://www.cppblog.com/zenliang/articles/131094.html
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
			if (nums[i] == nums[num5] * 5) {// ���ﲻ����else if����Ϊ������������Сֵ����ʱ��ҪŲ����
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
