package updateBits;

/**
 * 给出两个32位的整数N和M，以及两个二进制位的位置i和j。
 * 
 * 写一个方法来使得N中的第i到j位等于M（M会是N中从第i为开始到第j位的子串）
 * 
 * 样例 给出N = (10000000000)2，M = (10101)2， i = 2, j = 6
 * 
 * 返回 N = (10001010100)2
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(updateBits(1024, 21, 2, 6));
		System.out.println(updateBits(0, 1, 2, 6));
		System.out.println(updateBits(2147483647, 3456, 11, 22));
	}

	// 都是小正数的情况下 是一个不错的算法
	public static int updateBits(int n, int m, int i, int j) {
		return n - n % (2 << j) + n % (2 << i) + (m << i);
	}

	public static int updateBits1(int n, int m, int i, int j) {
		int mask;
		if (j < 31) {
			mask = ~(1 << (j + 1)) - (1 << i);
		} else {
			mask = (1 << i) - 1;
		}
		return (m << i) + (n & mask);
	}
}
