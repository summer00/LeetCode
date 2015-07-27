package removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class myAnswer {
	public static void main(String[] args) {
		int[] A = new int[] { 1, 1, 2, 2, 2, 5, 6 };
		int n = removeDuplicates(A);
		System.out.println(n);
	}

	public static int removeDuplicates(int nums[]) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != nums[j]) {
				nums[++j] = nums[i];
			}
		}
		System.out.println(Arrays.toString(nums));
		return j + 1;
	}
}
