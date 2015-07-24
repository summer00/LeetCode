package powerOfTwo;

/**
 * https://github.com/illuz/leetcode/tree/master/solutions/231.Power_of_Two
 */
public class others1 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(4));
		System.out.println(isPowerOfTwo(0));
	}

	public static boolean isPowerOfTwo(int n) {
		if (n <= 0)
			return false;
		n &= (n - 1);
		return n == 0;
	}
}
