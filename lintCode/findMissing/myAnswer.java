package findMissing;

/**
 * ����һ������ 0 .. N �� N ���������У��ҳ�0 .. N ��û�г����������е��Ǹ�����
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
