package trailingZeroes;

public class myAnswer {
	public static void main(String[] args) {
		System.out.println(trailingZeroes(5));
	}

	public static int trailingZeroes(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 5;
			count += n;
		}
		return count;
	}
}
