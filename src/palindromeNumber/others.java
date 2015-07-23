package palindromeNumber;

import java.util.Scanner;

public class others {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println(isPalindrome1(cin.nextInt()));
		cin.close();
	}

	// 直接算出输入数字的回文
	// https://github.com/illuz/leetcode/tree/master/solutions/009.Palindrome_Number
	public static boolean isPalindrome(int x) {
		long xx = x;
		long new_xx = 0;
		while (xx > 0) {
			new_xx = new_xx * 10 + xx % 10;
			xx /= 10;
		}
		return new_xx == x;
	}

	// 不断比较第一位和最后一位
	// 在这本书里：https://github.com/soulmachine/leetcode
	public static boolean isPalindrome1(int x) {
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
