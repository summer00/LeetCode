package numTrees;

/**
 * 给出 n，问由 1...n 为节点组成的不同的二叉查找树有多少种？
 * 
 * 卡塔兰数
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
