package compareStrings;

/**
 * �Ƚ������ַ���A��B��ȷ��A���Ƿ����B�����е��ַ����ַ���A��B�е��ַ����� ��д��ĸ
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
