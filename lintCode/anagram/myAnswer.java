package anagram;

import java.util.Arrays;

/**
 * 写出一个函数 anagram(s, t) 去判断两个字符串是否是颠倒字母顺序构成的
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(anagram("abc", "abd"));
	}

	public static boolean anagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] ss = s.toCharArray(), tt = t.toCharArray();
		Arrays.sort(ss);
		Arrays.sort(tt);
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] != tt[i]) {
				return false;
			}
		}
		return true;
	}
}
