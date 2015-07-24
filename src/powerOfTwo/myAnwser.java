package powerOfTwo;

/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class myAnwser {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo1(4));
		System.out.println(isPowerOfTwo1(0));
	}

	public static boolean isPowerOfTwo(int n) {
		if (n <= 0)
			return false;
		while (n > 1) {
			if (n % 2 != 0)
				return false;
			n /= 2;
		}
		return true;
	}

	public static boolean isPowerOfTwo1(int n) {
		if (n <= 0)
			return false;
		double res = Math.log(n) / Math.log(2);
		return res % 1 <= 0.000000000001;
	}
}
