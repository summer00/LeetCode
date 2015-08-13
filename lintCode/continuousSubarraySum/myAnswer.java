package continuousSubarraySum;

import java.util.ArrayList;

/**
 * ����һ���������飬���ҳ�һ�����������飬ʹ�ø�������ĺ����
 * �����ʱ����ֱ𷵻ص�һ�����ֺ����һ�����ֵ�ֵ�������������ͬ�Ĵ𰸣��뷵����������һ����
 * 
 * http://www.ahathinking.com/archives/120.html
 * http://www.cnblogs.com/xwdreamer/archive/2012/05/04/2482507.html
 * http://www.cnblogs.com/waytofall/archive/2012/04/10/2439820.html
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 1, -1 };
		int[] B = { 1, 2, -2, -100, 1, 2, 9, -2 };
		System.out.println(continuousSubarraySum(A));
		System.out.println(continuousSubarraySum(B));
		System.out.println(continuousSubarraySum1(A));
		System.out.println(continuousSubarraySum1(B));
	}

	// ��̬�滮
	public static ArrayList<Integer> continuousSubarraySum1(int[] A) {
		ArrayList<Integer> list = new ArrayList<>();
		int sum = Integer.MIN_VALUE, tempSum = 0;
		int start = 0, end = 0, tempStart = 0, tempEnd = 0;
		for (int i = 0; i < A.length; i++) {
			if (tempSum + A[i] > A[i]) {
				tempSum += A[i];
				tempEnd = i;
			} else {
				tempSum = A[i];
				tempStart = i;
			}
			if (tempSum > sum) {
				sum = tempSum;
				start = tempStart;
				end = tempEnd;
			}
		}
		list.add(start);
		list.add(end);
		return list;
	}

	// ̰��
	public static ArrayList<Integer> continuousSubarraySum(int[] A) {
		ArrayList<Integer> list = new ArrayList<>();
		int sum = Integer.MIN_VALUE, tempSum = Integer.MIN_VALUE;
		int start = 0, end = 0, tempStart = 0;
		for (int i = 0; i < A.length; i++) {
			if (tempSum < 0) {// ���ǰ��ĺ���һ������������ǰ����������¿�ʼ
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
