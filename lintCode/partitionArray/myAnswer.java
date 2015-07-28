package partitionArray;

import java.util.Arrays;

/**
 * 给出一个整数数组nums和一个整数k。划分数组（即移动数组nums中的元素），使得：
 * 
 * 所有小于k的元素移到左边
 * 
 * 所有大于等于k的元素移到右边
 * 
 * 返回数组划分的位置，即数组中第一个位置i，满足nums[i]大于等于k。
 * 
 * 样例 给出数组nums=[3,2,2,1]和 k=2，返回 1
 * 
 * 注意 你应该真正的划分数组nums，而不仅仅只是计算比k小的整数数，如果数组nums中的所有元素都比k小，则返回nums.length。
 * 
 * 挑战 要求在原地使用O(n)的时间复杂度来划分数组
 * 
 * 排序：http://blog.csdn.net/hguisu/article/details/7776068
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
