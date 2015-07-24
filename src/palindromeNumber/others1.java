package palindromeNumber;

import java.util.Scanner;

/**
 * ���ϱȽϵ�һλ�����һλ 
 * ���Ȿ���https://github.com/soulmachine/leetcode
 */

public class others1 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println(isPalindrome(cin.nextInt()));
		cin.close();
	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int d = 1;
		while (x / d >= 10) {
			d *= 10;
		}
		while (x > 0) {
			if (x / d != x % 10) {
				return false;
			} else {
				x = x % d / 10;
				d /= 100;
			}
		}
		return true;
	}

}
