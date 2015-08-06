package setZeroes;

import java.util.Arrays;

public class others1 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 3 }, { 1, 3, 4 }, { 1, 0, 4 } };
		setZeroes(matrix);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	public static void setZeroes(int[][] matrix) {
		if (matrix == null || matrix.length == 0)
			return;

		int rows = matrix.length;
		int cols = matrix[0].length;

		boolean empty_row0 = false;
		boolean empty_col0 = false;
		for (int i = 0; i < cols; i++) {
			if (matrix[0][i] == 0) {
				empty_row0 = true;
				break;
			}
		}

		for (int i = 0; i < rows; i++) {
			if (matrix[i][0] == 0) {
				empty_col0 = true;
				break;
			}
		}

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix[0][j] == 0 || matrix[i][0] == 0)
					matrix[i][j] = 0;
			}
		}

		if (empty_row0) {
			for (int i = 0; i < cols; i++) {
				matrix[0][i] = 0;
			}
		}

		if (empty_col0) {
			for (int i = 0; i < rows; i++) {
				matrix[i][0] = 0;
			}
		}
	}
}
