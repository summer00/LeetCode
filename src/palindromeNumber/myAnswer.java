package palindromeNumber;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(isPalindrome(0));
	}

	public static boolean isPalindrome(int x) {
		StringBuffer sb = new StringBuffer(x + "");
		return (x+"").equals(sb.reverse().toString());
	}

	public static boolean isPalindrome1(int x) {
		String s = x + "";
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
