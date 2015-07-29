package findMin;

/**
 * 寻找旋转排序数组中的最小值
 * 
 * 假设一个旋转排序的数组其起始位置是未知的（比如0 1 2 4 5 6 7 可能变成是4 5 6 7 0 1 2）。
 * 
 * 你需要找到其中最小的元素。
 * 
 * 你可以假设数组中不存在重复的元素。
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] num = { 3, 1, 2 };
		System.out.println(findMin1(num));
	}

	public static int findMin(int[] num) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		return min;
	}

	public static int findMin1(int[] num) {
		int left = 0, right = num.length - 1, mid;
		while (left < right) {
			mid = (left + right) / 2;
			if (num[mid] > num[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return num[left];
	}
}
