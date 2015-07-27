package longestCommonPrefix;
/**
 * 最长公共前缀
 */
public class myAnswer {

	public static void main(String[] args) {
		System.out.println(longestCommonPrefix(new String[] { "abc", "abcd", "ab", "abc" }));
	}

	public static String longestCommonPrefix(String[] strs) {
		StringBuffer sb = new StringBuffer();
		if (strs == null || strs.length == 0) {
			return "";
		} else if (strs.length == 1) {
			return strs[0];
		}
		for (int i = 0; i < strs[0].length() && i < strs[1].length(); i++) {
			if (strs[0].charAt(i) == strs[1].charAt(i)) {
				sb.append(strs[0].charAt(i));
			}
		}
		int index = sb.length();
		for (int i = 1; i < strs.length; i++) {
			if (strs[i] == null) {
				return "";
			}
			int j = 0;
			for (; j < sb.length() && j < strs[i].length(); j++) {
				if (sb.charAt(j) != strs[i].charAt(j)) {
					break;
				}
			}
			if (index > j) {
				index = j;
			}
		}
		return sb.substring(0, index);
	}
}
