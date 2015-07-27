package removeDuplicates;

import java.util.Arrays;

/**
 * 给定一个排序数组，在原数组中删除重复出现的数字，使得每个元素只出现一次，并且返回新的数组的长度。
 * 
 * 不要使用额外的数组空间，必须在原地没有额外空间的条件下完成。
 * 
 * 样例 给出数组A =[1,1,2]，你的函数应该返回长度2，此时A=[1,2]。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] nums = new int[] { -10, 0, 1, 1, 2, 3 };
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}

	public static int removeDuplicates(int nums[]) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[index++] = nums[i];
			}
		}
		return index;
	}
}
