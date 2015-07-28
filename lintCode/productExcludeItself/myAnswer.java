package productExcludeItself;

import java.util.ArrayList;

/**
 * 数组剔除元素后的乘积
 * 
 * 给定一个整数数组A。
 * 
 * 定义B[i] = A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]， 计算B的时候请不要使用除法。
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
