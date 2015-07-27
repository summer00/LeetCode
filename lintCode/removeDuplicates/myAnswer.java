package removeDuplicates;

import java.util.Arrays;

/**
 * ����һ���������飬��ԭ������ɾ���ظ����ֵ����֣�ʹ��ÿ��Ԫ��ֻ����һ�Σ����ҷ����µ�����ĳ��ȡ�
 * 
 * ��Ҫʹ�ö��������ռ䣬������ԭ��û�ж���ռ����������ɡ�
 * 
 * ���� ��������A =[1,1,2]����ĺ���Ӧ�÷��س���2����ʱA=[1,2]��
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
