package anagram;
/**
 * 全是字母时可用
 */
public class others1 {
	public static void main(String[] args) {
		System.out.println(anagram("django", "naogdj"));
	}

	public static boolean anagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] word = new int[52];
		for (int i = 0; i < s.length(); i++) {
			int n = s.codePointAt(i) - 97 >= 0 ? s.codePointAt(i) - 97 : s.codePointAt(i) - 65,
					m = t.codePointAt(i) - 97 >= 0 ? t.codePointAt(i) - 97 : t.codePointAt(i) - 65;
			word[n]++;
			word[m]--;
			System.out.println(n + "," + m);
		}
		for (int i = 0; i < word.length; i++) {
			if (word[i] > 0)
				return false;
		}
		return true;
	}
}
