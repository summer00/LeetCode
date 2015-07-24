package summaryRanges;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its
 * ranges.
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] nums = new int[] {};
		System.out.println(summaryRanges(nums));
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		if (nums.length == 0)
			return list;
		int temp = 0; // ¼ÇÂ¼¼ä¸ô
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i + 1] - nums[i] == 1) {
				temp++;
			} else {
				if (temp == 0) {
					list.add(nums[i] + "");
				} else {
					list.add(nums[i - temp] + "->" + nums[i]);
					temp = 0;
				}
			}
		}
		if (temp == 0) {
			list.add(nums[nums.length - 1] + "");
		} else {
			list.add(nums[nums.length - temp - 1] + "->" + nums[nums.length - 1]);
		}
		return list;
	}
}
