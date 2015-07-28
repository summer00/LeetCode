package searchInsert;

/**
 * 给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置。
 * 
 * 你可以假设在数组中无重复元素。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 1, 3 };
		System.out.println(searchInsert(A, 2));
	}

	public static int searchInsert(int[] A, int target) {
		if (A.length == 0) {
			return 0;
		}
		int left = 0, right = A.length - 1, mid = (left + right) / 2;
		while (left <= right) {
			if (A[mid] < target) {
				left = mid;
			} else if (A[mid] > target) {
				right = mid - 1;
			} else {
				return mid + 1;
			}
			mid = (left + right) / 2;
		}
		return mid + 1;
	}
}
