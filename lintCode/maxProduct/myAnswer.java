package maxProduct;

public class myAnswer {
	public static void main(String[] args) {
		int[] nums = { 2, 1, 5, 8, -2, 4 };
		System.out.println(maxProduct1(nums));
	}

	// 动态规划
	public static int maxProduct1(int[] nums) {
		int n = nums.length;
		if (n <= 0)
			return 0;

		if (n == 1)
			return nums[0];
		int maxTemp = nums[0];
		int minTemp = nums[0];

		int global = nums[0];
		for (int i = 1; i != n; ++i) {
			int temp = maxTemp;
			maxTemp = Math.max(Math.max(nums[i] * maxTemp, nums[i]), nums[i] * minTemp);
			minTemp = Math.min(Math.min(nums[i] * temp, nums[i]), nums[i] * minTemp);
			global = Math.max(global, maxTemp);
		}
		return global;
	}

	// 直接求值
	public static int maxProduct(int[] nums) {
		int subArrayProduct = Integer.MIN_VALUE;
		for (int i = 0; i != nums.length; ++i) {
			int nTempProduct = 1;
			for (int j = i; j != nums.length; ++j) {
				if (j == i)
					nTempProduct = nums[i];
				else
					nTempProduct *= nums[j];
				if (nTempProduct >= subArrayProduct)
					subArrayProduct = nTempProduct;
			}
		}
		return subArrayProduct;
	}

}
