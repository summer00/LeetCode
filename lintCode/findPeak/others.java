package findPeak;

public class others {
	public static void main(String[] args) {
		int[] A = { 1, 1, 1, 3, 4, 5, 7, 6 };
		System.out.println(findPeak(A));
	}

	public static int findPeak(int[] A) {
		int start = 1, end = A.length - 2; // 1.答案在之间，2.不会出界
		while (start + 1 < end) {
			int mid = (start + end) / 2;
			if (A[mid] < A[mid - 1]) {
				end = mid;
			} else if (A[mid] < A[mid + 1]) {
				start = mid;
			} else {
				end = mid;
			}
		}
		if (A[start] < A[end]) {
			return end;
		} else {
			return start;
		}
	}
}
