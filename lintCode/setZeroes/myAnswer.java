package setZeroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 给定一个m×n矩阵，如果一个元素是0，则将其所在行和列全部元素变成0。
 * 
 * 需要在原地完成。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[][] matrix = { { 3, 5, 5, 6, 9, 1, 4, 5, 0, 5 }, { 2, 7, 9, 5, 9, 5, 4, 9, 6, 8 },
				{ 6, 0, 7, 8, 1, 0, 1, 6, 8, 1 }, { 7, 2, 6, 5, 8, 5, 6, 5, 0, 6 }, { 2, 3, 3, 1, 0, 4, 6, 5, 3, 5 },
				{ 5, 9, 7, 3, 8, 8, 5, 1, 4, 3 }, { 2, 4, 7, 9, 9, 8, 4, 7, 3, 7 }, { 3, 5, 2, 8, 8, 2, 2, 4, 9, 8 } };
		setZeroes(matrix);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	public static void setZeroes1(int[][] matrix) {
		if (matrix.length == 0) {
			return;
		}

		List<String> list = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					list.add(i + "," + j);
				}
			}
		}

		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			int i = Integer.parseInt(string.split(",")[0]);
			int j = Integer.parseInt(string.split(",")[1]);

			for (int k = 0; k < matrix[i].length; k++) {
				matrix[i][k] = 0;
			}
			for (int k = 0; k < matrix.length; k++) {
				matrix[k][j] = 0;
			}
		}
		
	}

	public static void setZeroes(int[][] matrix) {
		if (matrix.length == 0) {
			return;
		}
		int[][] zerose = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					zerose[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < zerose.length; i++) {
			for (int j = 0; j < zerose[i].length; j++) {
				if (zerose[i][j] == 1) {
					for (int k = 0; k < matrix[i].length; k++) {
						matrix[i][k] = 0;
					}
					for (int k = 0; k < matrix.length; k++) {
						matrix[k][j] = 0;
					}
				}
			}
		}

	}
}
