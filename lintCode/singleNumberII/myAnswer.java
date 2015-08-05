package singleNumberII;

import java.util.HashMap;
import java.util.Map;

/**
 * 给出3*n + 1 个的数字，除其中一个数字之外其他每个数字均出现三次，找到这个数字。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 1, 1, 2, 3, 3, 3, 2, 2, 4, 1 };
		System.out.println(singleNumberII(A));
	}

	public static int singleNumberII(int[] A) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			if (map.get(A[i] + "") == null) {
				map.put(A[i] + "", 1);
			} else {
				map.put(A[i] + "", map.get(A[i] + "") + 1);
			}
		}
		for (String s : map.keySet()) {
			if (map.get(s) != 3) {
				return Integer.parseInt(s);
			}
		}
		return 0;
	}
}
