package partitionArray;

import java.util.Arrays;

/**
 * ����һ����������nums��һ������k���������飨���ƶ�����nums�е�Ԫ�أ���ʹ�ã�
 * 
 * ����С��k��Ԫ���Ƶ����
 * 
 * ���д��ڵ���k��Ԫ���Ƶ��ұ�
 * 
 * �������黮�ֵ�λ�ã��������е�һ��λ��i������nums[i]���ڵ���k��
 * 
 * ���� ��������nums=[3,2,2,1]�� k=2������ 1
 * 
 * ע�� ��Ӧ�������Ļ�������nums����������ֻ�Ǽ����kС�����������������nums�е�����Ԫ�ض���kС���򷵻�nums.length��
 * 
 * ��ս Ҫ����ԭ��ʹ��O(n)��ʱ�临�Ӷ�����������
 * 
 * ����http://blog.csdn.net/hguisu/article/details/7776068
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 2, 1 };
		System.out.println(partitionArray(nums, 2));
	}

	public static int partitionArray(int[] nums, int k) {
		Arrays.sort(nums);
		int i = 0;
		for (; i < nums.length; i++) {
			if (nums[i] >= k) {
				break;
			}
		}
		return i;
	}

}
