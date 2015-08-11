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
		int[] B = { 1, 2, -2, -100, 1, 2, -2 };
		System.out.println(continuousSubarraySum(A));
		System.out.println(continuousSubarraySum(B));
	}

	public static ArrayList<Integer> continuousSubarraySum(int[] A) {
		ArrayList<Integer> list = new ArrayList<>();
		int sum = Integer.MIN_VALUE, tempSum = Integer.MIN_VALUE;
		int start = 0, end = 0, tempStart = 0;
		for (int i = 0; i < A.length; i++) {
			if (tempSum < 0) {// 如果前面的和是一个负数，舍弃前面的数，从新开始
				tempSum = A[i];
				tempStart = i;
			} else {
				tempSum += A[i];
			}
			if (sum < tempSum) {
				sum = tempSum;
				end = i;
				start = tempStart;
			}
		}
		list.add(start);
		list.add(end);
		return list;
	}
}
