package findMissing;

/**
 * 给出一个包含 0 .. N 中 N 个数的序列，找出0 .. N 中没有出现在序列中的那个数。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] nums = { 0, 1, 3, 4 };
		System.out.println(findMissing(nums));
	}

	public static int findMissing(int[] nums) {
		int l = nums.length;
		int result = (l + 1) * l / 2;
		for (int i = 0; i < nums.length; i++) {
			result -= nums[i];
		}
		return result;
	}
}
