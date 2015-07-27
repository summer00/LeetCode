package mergeSortedArray;

import java.util.Arrays;

/**
 * �ϲ������������������A��B���һ���µ����顣
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 1, 3, 4, 6, 0, 0 };
		int[] B = { 5, 8 };
		mergeSortedArray(A, 4, B, 2);
		System.out.println(Arrays.toString(A));
	}

	/**
	 * ����others�Ľⷨ����̫���ˣ�������= =��
	 */
	public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
		int[] result = new int[n + m];
		if (n == 0) {
			return;
		} else if (m == 0) {
			for (int i = 0; i < n; i++) {
				A[i] = B[i];
			}
		}
		int index = 0;
		for (int i = 0, j = 0; index < m + n;) {
			if (j < n) {
				if (i < m && A[i] < B[j]) {
					result[index++] = A[i++];
				} else {
					result[index++] = B[j++];
				}
			} else {
				result[index++] = A[i++];
			}
		}
		for (int i = 0; i < result.length; i++) {
			A[i] = result[i];
		}
	}
}
