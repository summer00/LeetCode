package subarraySum;

import java.util.ArrayList;

/**
 * ����һ���������飬�ҵ���Ϊ��������顣��Ĵ���Ӧ�÷�������Ҫ������������ʼλ�úͽ���λ��
 * 
 * ���� ����[-3, 1, 2, -3, 4]������[0, 2] ���� [1, 3].
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
