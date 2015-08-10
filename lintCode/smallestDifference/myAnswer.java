package smallestDifference;

import java.util.Arrays;

/**
 * 给定两个整数数组（第一个是数组A，第二个是数组B）
 * 
 * 在数组A中取A[i]，数组B中取B[j]，A[i]和B[j]两者的差越小越好(|A[i] - B[j]|)。返回最小差。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 10, 25, 55, 34 }, B = { 18, 47, 46, 42 };
		System.out.println(smallestDifference1(A, B));
		System.out.println(smallestDifference(A, B));
	}

	public static int smallestDifference1(int[] A, int[] B) {
		int result = Integer.MAX_VALUE;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			int pos = searchInsert(B, A[i]);
			int temp;
			if (pos == B.length) {
				temp = Math.abs(A[i] - B[pos - 1]);
			} else if (pos == 0) {
				temp = Math.abs(A[i] - B[pos]);
			} else {
				int temp1 = Math.abs(A[i] - B[pos]);
				int temp2 = Math.abs(A[i] - B[pos - 1]);
				temp = temp1 < temp2 ? temp1 : temp2;
			}
			if (temp < result) {
				result = temp;
			}
		}
		return result;
	}

	public static int searchInsert(int[] A, int target) {
		int left = 0, right = A.length - 1, mid = (left + right) / 2;
		while (left <= right) {
			if (A[mid] < target) {
				left = mid + 1;
			} else if (A[mid] > target) {
				right = mid - 1;
			} else {
				return mid;
			}
			mid = (left + right) / 2;
		}
		return left;
	}

	// 超时
	public static int smallestDifference(int[] A, int[] B) {
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				int temp = Math.abs(A[i] - B[j]);
				if (result > temp) {
					result = temp;
				}
			}
		}
		return result;
	}
}
