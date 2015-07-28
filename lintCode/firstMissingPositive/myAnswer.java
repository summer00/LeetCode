package firstMissingPositive;

/**
 * 丢失的第一个正整数
 * 
 * 给出一个无序的正数数组，找出其中没有出现的最小正整数。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, -1, -1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1,
				-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int[] B = new int[] { 3, 4, -1, 1 };
		int[] C = new int[] { 9 };
		int[] D = new int[] { 1 };
		int[] E = new int[] { 2, 2, 2 };
		System.out.println(firstMissingPositive(A));
		System.out.println(firstMissingPositive1(A));
		System.out.println("-----------");
		System.out.println(firstMissingPositive(B));
		System.out.println(firstMissingPositive1(B));
		System.out.println("-----------");
		System.out.println(firstMissingPositive(C));
		System.out.println(firstMissingPositive1(C));
		System.out.println("-----------");
		System.out.println(firstMissingPositive(D));
		System.out.println(firstMissingPositive1(D));
		System.out.println("-----------");
		System.out.println(firstMissingPositive(E));
		System.out.println(firstMissingPositive1(E));
	}

	public static int firstMissingPositive1(int[] A) {
		int[] temp = new int[A.length + 1];
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0 && A[i] <= A.length) {
				temp[A[i]] = 1;
			}
		}
		int i = 1;
		for (; i < temp.length; i++) {
			if (temp[i] == 0) {
				break;
			}
		}
		return i;
	}

	public static int firstMissingPositive(int[] A) {
		int[] positive = new int[A.length];
		int l = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				positive[l] = A[i];
				l++;
			}
		}
		if (l != 0) {
			int min = positive[0], res = 0;
			int[] temp = new int[l];
			for (int i = 0; i < temp.length; i++) {
				if (min > positive[i]) {
					min = positive[i];
				}
			}
			if (min > 1) {
				return 1;
			}
			for (int i = 0; i < l; i++) {
				if (positive[i] - min < l) {
					temp[positive[i] - min] = 1;
				}
			}
			for (int i = 0; i < l; i++) {
				if (temp[i] == 1) {
					res = i + min;
				} else {
					break;
				}
			}
			return res + 1;
		}
		return 1;
	}
}
