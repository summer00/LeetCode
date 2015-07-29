package findPeak;

/**
 * 你给出一个整数数组(size为n)，其具有以下特点：
 * 
 * 相邻位置的数字是不同的 A[0] < A[1] 并且 A[n - 2] > A[n - 1]
 * 
 * 假定P是峰值的位置则满足A[P] > A[P-1]且A[P] > A[P+1]，返回数组中任意一个峰值的位置。
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
