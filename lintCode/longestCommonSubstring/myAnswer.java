package longestCommonSubstring;

/**
 * 最长公共子串
 * http://www.cnblogs.com/ider/p/longest-common-substring-problem-optimization.html
 * http://my.oschina.net/leejun2005/blog/117167
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(longestCommonSubstring("www.lintcode.com code", "www.ninechapter.com code"));
	}

	public static int longestCommonSubstring(String A, String B) {
		int res = 0;
		for (int i = 0; i < A.length(); i++) {
			for (int j = 0; j < B.length(); j++) {
				int m = i, n = j, l = 0;
				while (m < A.length() && n < B.length()) {
					if (A.charAt(m) != B.charAt(n)) {
						break;
					} else {
						l++;
						m++;
						n++;
					}
				}
				if (l > res) {
					res = l;
				}
			}
		}
		return res;
	}
}
