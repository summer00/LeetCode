package searchMatrix;

/**
 * 在二维数组中查找
 */
public class myAnswer {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		int[][] matrix1 = { { 1, 5, 8, 12, 13, 15, 18, 20, 25, 26, 28, 33, 38, 40, 43, 49, 52, 53, 59 },
				{ 84, 100, 110, 129, 141, 156, 177, 198, 220, 242, 254, 266, 284, 297, 316, 326, 343, 358, 373 },
				{ 388, 398, 419, 439, 449, 460, 472, 495, 516, 539, 560, 582, 600, 610, 624, 643, 668, 691, 710 },
				{ 720, 733, 751, 765, 787, 804, 814, 832, 856, 880, 905, 930, 950, 974, 999, 1012, 1022, 1039, 1061 },
				{ 1081, 1091, 1102, 1126, 1151, 1175, 1194, 1219, 1239, 1253, 1263, 1274, 1287, 1298, 1308, 1318, 1337,
						1361, 1382 },
				{ 1404, 1417, 1437, 1452, 1466, 1487, 1503, 1518, 1537, 1555, 1578, 1590, 1601, 1613, 1636, 1659, 1669,
						1688, 1712 } };
		System.out.println(searchMatrix(matrix, 1));
		System.out.println(searchMatrix(matrix1, 1888));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix != null && matrix.length != 0 && matrix[0].length != 0) {
			int rl = matrix[0].length - 1;
			int r = 0, cs = 0, ce = rl, mid;
			while (cs <= ce && r < matrix.length) {
				mid = (cs + ce) / 2;
				if (matrix[r][mid] > target) {
					if (matrix[r][0] > target) {
						break;
					} else {
						ce = mid - 1;
					}
				} else if (matrix[r][mid] < target) {
					if (matrix[r][rl] < target) {
						cs = 0;
						ce = rl;
						r++;
					} else {
						cs = mid + 1;
					}
				} else {
					System.out.println(r + "," + mid);
					return true;
				}
			}
		}
		return false;
	}
}