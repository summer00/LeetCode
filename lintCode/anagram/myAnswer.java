package anagram;

import java.util.Arrays;

/**
 * д��һ������ anagram(s, t) ȥ�ж������ַ����Ƿ��ǵߵ���ĸ˳�򹹳ɵ�
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
