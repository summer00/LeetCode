package containsDuplicate;

import java.util.Arrays;

/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 5, 6 };
		System.out.println(containsDuplicate(nums));
	}

	public static boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] == nums[i]) {
				return true;
			}
		}
		return false;
	}

}
