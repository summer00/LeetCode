package summaryRanges;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array without duplicates, return the summary of its
 * ranges.
 * 
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 * http://www.cnblogs.com/NickyYe/p/4601865.html
 */
public class others1 {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 2, 4, 5, 7 };
		System.out.println(summaryRanges(nums));
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> res = new ArrayList<String>();
		int start = 0;
		for (int i = 1; i <= nums.length; i++) {
			if (i == nums.length || nums[i] > nums[i - 1] + 1) {
				StringBuilder cur = new StringBuilder();
				if (i - 1 == start) {
					cur.append(nums[start]);
					res.add(cur.toString());
				} else {
					cur.append(nums[start]);
					cur.append("->");
					cur.append(nums[i - 1]);
					res.add(cur.toString());
				}
				start = i;
			}
		}
		return res;
	}

}
