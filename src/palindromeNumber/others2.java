package palindromeNumber;

import java.util.Scanner;

/**
 * ֱ������������ֵĻ���
 * https://github.com/illuz/leetcode/tree/master/solutions/009.Palindrome_Number
 */
public class others2 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println(isPalindrome(cin.nextInt()));
		cin.close();
	}

	public static boolean isPalindrome(int x) {
		long xx = x;
		long new_xx = 0;
		while (xx > 0) {
			new_xx = new_xx * 10 + xx % 10;
			xx /= 10;
		}
		return new_xx == x;
	}

}
