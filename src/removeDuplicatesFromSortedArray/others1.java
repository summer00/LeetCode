package removeDuplicatesFromSortedArray;

public class others1 {
	public static void main(String[] args) {
		System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2));
	}

	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		int s1 = (C - A) * (D - B);
		int s2 = (G - E) * (H - F);
		if (A > G || C < E || B > H || D < F) {
			return s1 + s2;
		}
		int a = Math.max(A, E);
		int b = Math.max(B, F);
		int c = Math.min(C, G);
		int d = Math.min(D, H);
		return s1 + s2 - (c - a) * (d - b);
	}
}
