package compareStrings;

/**
 * 比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(compareStrings("abcd", ""));
	}

	public static boolean compareStrings(String A, String B) {
		if (B.length() > A.length()) {
			return false;
		}
		int[] words = new int[26];
		for (int i = 0; i < A.length(); i++) {
			words[A.codePointAt(i) - 65]--;
		}
		for (int i = 0; i < B.length(); i++) {
			words[B.codePointAt(i) - 65]++;
		}
		for (int i = 0; i < words.length; i++) {
			if (words[i] > 0) {
				return false;
			}
		}
		return true;
	}
}
