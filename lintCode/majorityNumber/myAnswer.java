package majorityNumber;

import java.util.ArrayList;

/**
 * ����һ���������飬�ҳ���Ԫ�أ����������еĳ��ִ����ϸ��������Ԫ�ظ����Ķ���֮һ��
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
