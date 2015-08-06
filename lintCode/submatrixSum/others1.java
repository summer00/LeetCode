package submatrixSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数矩阵，请找出一个子矩阵，使得其数字之和等于0.
 * 
 * 输出答案时，请返回左上数字和右下数字的坐标。
 */
public class others1 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 5, -1 }, { -1, 7, -8 }, { 4, -8, 7 }, };
		int[][] a = submatrixSum(matrix);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

	// 利用sum缓存，不知道sum生成规则有什么用
	public static int[][] submatrixSum(int[][] matrix) {
		int[][] result = new int[2][2];
		int M = matrix.length;
		if (M == 0)
			return result;
		int N = matrix[0].length;
		if (N == 0)
			return result;
		// pre-compute: sum[i][j] = sum of submatrix [(0, 0), (i, j)]
		int[][] sum = new int[M + 1][N + 1];
		for (int j = 0; j <= N; ++j) {
			sum[0][j] = 0;
		}

		for (int i = 1; i <= M; ++i) {
			sum[i][0] = 0;
		}

		for (int i = 0; i < M; ++i) {
			for (int j = 0; j < N; ++j) {
				sum[i + 1][j + 1] = matrix[i][j] + sum[i + 1][j] + sum[i][j + 1] - sum[i][j];
			}
		}

		for (int l = 0; l < M; ++l) {
			for (int h = l + 1; h <= M; ++h) {
				Map<Integer, Integer> map = new HashMap<Integer, Integer>();
				for (int j = 0; j <= N; ++j) {
					int diff = sum[h][j] - sum[l][j];
					if (map.containsKey(diff)) {
						int k = map.get(diff);
						result[0][0] = l;
						result[0][1] = k;
						result[1][0] = h - 1;
						result[1][1] = j - 1;
						return result;
					} else {
						map.put(diff, j);
					}
				}
			}
		}
		return result;
	}
}
