package searchInRotatedSortedArray;

/**
 * 假设有一个排序的按未知的旋转轴旋转的数组(比如，0 1 2 4 5 6 7 可能成为4 5 6 7 0 1 2)。
 * 
 * 给定一个目标值进行搜索，如果在数组中找到目标值返回数组中的索引位置，否则返回-1。
 * 
 * 你可以假设数组中不存在重复的元素。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 0, 1, 2, 3, 4 };
		int[] B = { 2, 3, 4, 0, 1 };
		int[] C = { 4, 3, 2, 1, 0 };
		int[] D = { 0, 1, 2, 3, 4 };
		System.out.println(search(A, 1));
		System.out.println(search(B, 2));
		System.out.println(search(C, 2));
		System.out.println(search(D, 2));
	}

	public static int search(int[] A, int target) {
		int low = 0, high = A.length - 1, mid;
		while (low <= high) {
			mid = (low + high) >> 1;
			if (A[mid] == target) {
				return mid;
			}
			if (A[low] < A[mid]) { // 左边有序
				if (target < A[mid] && target >= A[low]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else { // 右边有序
				if (target > A[mid] && target <= A[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
}
