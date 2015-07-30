package bitSwapRequired;

public class myAnswer {
	public static void main(String[] args) {
		System.out.println(bitSwapRequired(-1, -1));
	}

	public static int bitSwapRequired(int a, int b) {
		if (a == b) {
			return 0;
		}
		int n = a ^ b, count = 1;
		while ((n & (n - 1)) != 0) {
			n &= n - 1;
			count++;
		}
		return count;
	}
}
