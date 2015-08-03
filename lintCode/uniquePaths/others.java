package uniquePaths;

/**
 * 看似简单一道题，就是mxn的格子里从左上角走到右下角有多少种走法，只能向右或向下走。
 * 
 * 分析：向下需要 m-1 步，向右需要 n-1 步，所以总的走法就是 C(m-1, m-1+n-1) 或者 C(n-1， m-1+n-1)。
 */
public class others {
	public static void main(String[] args) {
		System.out.println(uniquePaths(1, 1));
	}

	public static int uniquePaths(int m, int n) {
		if (m == 0 || n == 0) {
			return 0;
		}

		int[][] sum = new int[m][n];
		for (int i = 0; i < m; i++) {
			sum[i][0] = 1;
		}
		for (int i = 0; i < n; i++) {
			sum[0][i] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				sum[i][j] = sum[i - 1][j] + sum[i][j - 1];
			}
		}
		return sum[m - 1][n - 1];
	}
}
