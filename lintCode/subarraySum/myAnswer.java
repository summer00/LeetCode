package subarraySum;

import java.util.ArrayList;

/**
 * 给定一个整数数组，找到和为零的子数组。你的代码应该返回满足要求的子数组的起始位置和结束位置
 * 
 * 样例 给出[-3, 1, 2, -3, 4]，返回[0, 2] 或者 [1, 3].
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] nums = new int[] { -3, 1, 2, -3, 4 };
		System.out.println(subarraySum(nums));
	}

	public static ArrayList<Integer> subarraySum(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum == 0) {
					list.add(i);
					list.add(j);
					return list;
				}
			}
		}
		return null;
	}
}
