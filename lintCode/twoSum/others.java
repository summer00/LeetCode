package twoSum;

/**
 * http://blog.csdn.net/martin_liang/article/details/46641231
 */
public class others {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 2, 2 };
		System.out.println(partitionArray(nums, 2));
	}

	public static int partitionArray(int[] nums, int k) {
		int left = 0, right = nums.length - 1;
		while (left < right) {
			// 从右找到第一个大于或等于k
			while ((left < right) && (nums[right] >= k))
				right--;
			// 从左找到第一个小于k
			while ((left < right) && nums[left] < k)
				left++;
			// 交换
			int tmp = nums[left];
			nums[left] = nums[right];
			nums[right] = tmp;
		}

		// all elements in nums are greater than or equal to k, l pointer never
		// shift， should return r
		if (left == 0 && nums[left] >= k)
			return right;

		// all elements in nums are smaller than k, r pointer never shift, shoud
		// return r+1
		if (right == nums.length - 1 && nums[left] < k)
			return right + 1;

		return right + 1;
	}
}
