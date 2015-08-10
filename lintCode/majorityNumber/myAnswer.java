package majorityNumber;

import java.util.ArrayList;

/**
 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
 */
public class myAnswer {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(1);
		nums.add(2);
		nums.add(2);
		nums.add(3);
		System.out.println(majorityNumber(nums));
	}

	/**
	 * http://www.douban.com/group/topic/68473876/
	 */
	public static int majorityNumber(ArrayList<Integer> nums) {
		if (nums.size() == 0)
			return 0;
		int count = 1;
		int majority_number = nums.get(0);
		for (int i = 1; i < nums.size(); ++i) {
			if (nums.get(i) == majority_number) {
				count++;
			} else if (count == 0) {
				majority_number = nums.get(i);
			} else {
				count--;
			}
		}
		return majority_number;
	}
}
