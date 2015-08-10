package continuousSubarraySum;

import java.util.ArrayList;

/**
 * 给定一个整数数组，请找出一个连续子数组，使得该子数组的和最大。
 * 输出答案时，请分别返回第一个数字和最后一个数字的值。（如果两个相同的答案，请返回其中任意一个）
 * 
 * http://www.ahathinking.com/archives/120.html
 * http://www.cnblogs.com/xwdreamer/archive/2012/05/04/2482507.html
 * http://www.cnblogs.com/waytofall/archive/2012/04/10/2439820.html
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 1, -1 };
		int[] B = { 1, 1, 1, 1, 1, 1, 1, 1, 1, -19, 1, 1, 1, 1, 1, 1, 1, -2, 1, 1, 1, 1, 1, 1, 1, 1, -2, 1, -15, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		System.out.println(continuousSubarraySum(A));
		System.out.println(continuousSubarraySum(B));
	}

	public static ArrayList<Integer> continuousSubarraySum(int[] A) {
		ArrayList<Integer> list = subSum(A, 0);
		return list;
	}

	private static ArrayList<Integer> subSum(int[] A, int l) {
		ArrayList<Integer> list = new ArrayList<>();
		int start = 0, end = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 0) {
				break;
			} else {
				start++;
			}
		}
		end = start - 1;
		boolean isDone = false;
		for (int i = start; i < A.length && (!isDone); i++) {
			if (A[i] >= 0) {
				end++;
			} else {
				int temp = 0;
				for (int j = i; j < A.length; j++) {
					temp += A[j];
					if (temp > 0) {
						i = j;
						end = j;
						break;
					}
				}
				if (temp < 0) {
					isDone = true;
				}
			}
		}
		list.add(start);
		list.add(end);
		return list;
	}
}
