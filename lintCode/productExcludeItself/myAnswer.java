package productExcludeItself;

import java.util.ArrayList;

/**
 * �����޳�Ԫ�غ�ĳ˻�
 * 
 * ����һ����������A��
 * 
 * ����B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]�� ����B��ʱ���벻Ҫʹ�ó�����
 */
public class myAnswer {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		A.add(1);
		A.add(2);
		A.add(3);
		System.out.println(productExcludeItself(A));
	}

	public static ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
		ArrayList<Long> list = new ArrayList<>();
		for (int i = 0; i < A.size(); i++) {
			long l = 1;
			for (int j = 0; j < A.size(); j++) {
				if (i != j) {
					l *= A.get(j);
				}
			}
			list.add(l);
		}
		return list;
	}
}
