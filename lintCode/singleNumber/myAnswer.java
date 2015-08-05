package singleNumber;

/**
 * ����2*n + 1 �������֣�������һ������֮������ÿ�����־��������Σ��ҵ�������֡�
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 1, 2, 2, 1, 3, 4, 3 };
		System.out.println(singleNumber(A));
	}

	public static int singleNumber(int[] A) {
		if (A.length == 0) {
			return 0;
		}

		int n = A[0];
		for (int i = 1; i < A.length; i++) {
			n = n ^ A[i];
		}

		return n;
	}
}
