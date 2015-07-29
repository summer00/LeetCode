package binarySearch;

/**
 * 二分查找 有重复
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 3, 7 };
		System.out.println(binarySearch(nums, 1));
	}

	public static int binarySearch(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (nums[mid] > target) {
				right = mid - 1;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				while (mid != 0 && nums[mid - 1] == target) {
					mid--;
				}
				return mid;
			}
		}
		return -1;
	}
}
