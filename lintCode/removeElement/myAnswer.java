package removeElement;

import java.util.Arrays;

/**
 * ����һ�������һ��ֵ����ԭ��ɾ����ֵ��ͬ�����֣�����������ĳ��ȡ�
 * 
 * Ԫ�ص�˳����Ըı䣬���Ҷ��µ����鲻����Ӱ�졣
 * 
 * ���� ����һ������ [0,4,4,0,0,2,4,4]����ֵ 4
 * 
 * ���� 4 ����4��Ԫ�ص�������Ϊ[0,0,0,2]
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
