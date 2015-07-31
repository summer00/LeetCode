package numTrees;

/**
 * ���� n������ 1...n Ϊ�ڵ���ɵĲ�ͬ�Ķ���������ж����֣�
 * 
 * ��������
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(numTrees(5));
	}

	public static int numTrees(int n) {
		int[] h = new int[n + 2];
		h[0] = 1;
		h[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				h[i] += h[j] * h[i - j - 1];
			}
		}
		return h[n];
	}
}
