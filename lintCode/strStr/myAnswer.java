package strStr;

/**
 * 字符串查找（又称查找子字符串），是字符串操作中一个很有用的函数。你的任务是实现这个函数。 对于一个给定的 source 字符串和一个
 * target字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。 如果不存在，则返回 -1。
 * 
 * KMP算法讲解：http://www.matrix67.com/blog/archives/115
 * 字符串匹配算法比较：http://blog.csdn.net/airfer/article/details/8951802
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(strStr("", ""));
	}

	public static int strStr(String source, String target) {
		if (source != null && target != null) {
			if (source.length() == 0 && target.length() == 0) {
				return 0;
			}
			for (int i = 0; i < source.length(); i++) {
				int j = 0;
				for (; j < target.length(); j++) {
					if (source.charAt(i + j) != target.charAt(j)) {
						break;
					}
				}
				if (j == target.length()) {
					return i;
				}
			}
		}
		return -1;
	}
}
