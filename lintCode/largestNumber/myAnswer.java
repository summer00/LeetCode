package largestNumber;

import java.util.Arrays;
import java.util.Comparator;
/**
 * 给出一组非负整数，重新排列他们的顺序把他们组成一个最大的整数
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] num = { 1, 101, 1 };
		System.out.println(largestNumber(num));
	}

	public static String largestNumber(int[] num) {
		StringBuffer sb = new StringBuffer();
		String[] s = new String[num.length];
		boolean isAllZore = true;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0 && isAllZore) {
				isAllZore = false;
			}
			s[i] = num[i] + "";
		}
		if (isAllZore) {
			return "0";
		}
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				return (a + b).compareTo(b + a);
			}
		});
		for (int i = s.length - 1; i >= 0; i--) {
			sb.append(s[i]);
		}
		return sb.toString();
	}

}
