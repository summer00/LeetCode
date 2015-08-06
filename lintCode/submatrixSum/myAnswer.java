package submatrixSum;

import java.util.Arrays;

/**
 * 给定一个整数矩阵，请找出一个子矩阵，使得其数字之和等于0.
 * 
 * 输出答案时，请返回左上数字和右下数字的坐标。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 5, -1 }, { -1, 7, -8 }, { 4, -8, 7 }, };
		int[][] a = submatrixSum(matrix);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

	public static int[][] submatrixSum(int[][] matrix) {
		int[][] result = new int[2][2];
		return result;
	}
}
