package findMin;

/**
 * 利用二分法
 */
public class others {
	public static void main(String[] args) {
		int[] num = { 6, 7, 1, 2, 4, 5 };
		System.out.println(findMin(num));
	}

	public static int findMin(int[] num) {
		int l = 0;
		int r = num.length - 1;
		if (num[l] < num[r])
			return num[l];
		while (l < r) {
			int mid = (l + r) / 2;
			if (num[mid] > num[r])
				l = mid + 1;
			else
				r = mid ;
		}
		return num[l];
	}
}
