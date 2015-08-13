package canJump;

/**
 * 给出一个非负整数数组，你最初定位在数组的第一个位置。
 * 
 * 数组中的每个元素代表你在那个位置可以跳跃的最大长度。
 * 
 * 判断你是否能到达数组的最后一个位置。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 2, 0, 1, 1, 4 };
		int[] B = { 3, 0, 1, 0, 4 };
		System.out.println(canJump(A));
		System.out.println(canJump(B));
	}

	public static boolean canJump(int[] A) {
		if (A.length == 0) {
			return false;
		}
		int step = A[0];
		for (int i = 0; i < A.length; i++) {
			if (step > 0) {
				step--;
				step = Math.max(step, A[i]);// 剩余的步数与当前能走的步数比较，取大的
			} else {
				return false;
			}
		}
		return true;
	}
}
