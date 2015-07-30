package searchRange;

import java.util.ArrayList;

public class myAnswer {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>();
		// A.add(1);
		A.add(7);
		A.add(7);
		A.add(7);
		A.add(7);
		A.add(7);
		// A.add(8);
		// A.add(8);
		// A.add(10);
		System.out.println(searchRange(A, 7));
	}

	public static ArrayList<Integer> searchRange(ArrayList<Integer> A, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		int low = 0, high = A.size() - 1, mid = (low + high) >> 1;
		int s = -1, e = -1;
		while (low <= high) {
			if (A.get(mid) == target) {
				s = mid;
				e = mid;
				while (s > 0 && A.get(s - 1) == target) {
					s--;
				}
				while (e < A.size() - 1 && A.get(e + 1) == target) {
					e++;
				}
				break;
			} else if (A.get(mid) > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			mid = (low + high) >> 1;
		}
		list.add(s);
		list.add(e);
		return list;
	}
}
