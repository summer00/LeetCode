package mergeSortedArray;

import java.util.Arrays;

/**
 * http://blog.csdn.net/f81892461/article/details/8583983
 */
public class others1 {
	public static void main(String[] args) {
		int[] A = { 1, 3, 4, 6, 0, 0 };
		int[] B = { 5, 8 };
		mergeSortedArray(A, 4, B, 2);
		System.out.println(Arrays.toString(A));
	}

	public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
		int i = m - 1, j = n - 1, k = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (A[i] < B[j]) {
				A[k--] = B[j--];
			} else {
				A[k--] = A[i--];
			}
		}
		while (j >= 0) {
			A[k--] = B[j--];
		}
	}
}
