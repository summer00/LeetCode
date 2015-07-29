package findPeak;

/**
 * �����һ����������(sizeΪn)������������ص㣺
 * 
 * ����λ�õ������ǲ�ͬ�� A[0] < A[1] ���� A[n - 2] > A[n - 1]
 * 
 * �ٶ�P�Ƿ�ֵ��λ��������A[P] > A[P-1]��A[P] > A[P+1]����������������һ����ֵ��λ�á�
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 1, 1, 1, 3, 4, 5, 7, 6 };
		System.out.println(findPeak(A));
	}

	public static int findPeak(int[] A) {
		for (int i = 1; i < A.length - 1; i++) {
			if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
				return A[i];
			}
		}
		return 0;
	}
}
