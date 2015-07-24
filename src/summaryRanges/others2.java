package summaryRanges;

import java.util.ArrayList;
import java.util.List;

/**
 * http://blog.csdn.net/sunao2002002/article/details/46653021
 */
public class others2 {

	public static void main(String[] args) {
		int[] nums = new int[] { 0, 1, 2, 4, 5, 7 };
		System.out.println(summaryRanges(nums));
	}

	public static List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList<>();
		if (nums.length == 0)
			return list;
		int begin = nums[0], end = nums[0]; // Ä£ÄâÖ¸Õë
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == end || nums[i] == end + 1) {
				end = nums[i];
			} else {
				list.add(format(begin, end));
				begin = end = nums[i];
			}
		}
		list.add(format(begin, end));
		return list;
	}

	private static String format(int begin, int end) {
		if (begin == end) {
			return begin + "";
		} else {
			return begin + "->" + end;
		}
	}
}
