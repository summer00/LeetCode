package removeElement;

import java.util.Arrays;

/**
 * 给定一个数组和一个值，在原地删除与值相同的数字，返回新数组的长度。
 * 
 * 元素的顺序可以改变，并且对新的数组不会有影响。
 * 
 * 样例 给出一个数组 [0,4,4,0,0,2,4,4]，和值 4
 * 
 * 返回 4 并且4个元素的新数组为[0,0,0,2]
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = new int[] { 0, 4, 4, 0, 0, 2, 4, 4 };
		System.out.println(removeElement(A, 4));
		System.out.println(Arrays.toString(A));
	}

	public static int removeElement(int[] A, int elem) {
		int index = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != elem) {
				A[index++] = A[i];
			}
		}
		return index;
	}
}
