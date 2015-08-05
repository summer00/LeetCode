package singleNumberII;

/**
 * 给出3*n + 1 个的数字，除其中一个数字之外其他每个数字均出现三次，找到这个数字。
 */
public class others1 {
	public static void main(String[] args) {
		int[] A = { 1, 1, 2, 3, 3, 3, 2, 2, 4, 1 };
		System.out.println(singleNumberII(A));
	}

	/**
	 * 其中ones记录了所有出现了模3余1次的bit，twos记录的是余2的。not_threes是当一个bit出现第3次的时候，把它清掉。
	 * 最后输出ones（如果题目中那个特殊的数出现了1次，当然如果是出现2次的话，应该输出twos
	 * http://www.acmerblog.com/leetcode-single-number-ii-5394.html
	 */
	public static int singleNumberII(int[] A) {
		int once = 0;
		int twice = 0;

		for (int i = 0; i < A.length; i++) {
			twice |= once & A[i];
			once ^= A[i];
			int not_three = ~(once & twice);
			once = not_three & once;
			twice = not_three & twice;
		}
		return once;
	}
}
