package submatrixSum;

import java.util.Arrays;

/**
 * ����һ�������������ҳ�һ���Ӿ���ʹ��������֮�͵���0.
 * 
 * �����ʱ���뷵���������ֺ��������ֵ����ꡣ
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
