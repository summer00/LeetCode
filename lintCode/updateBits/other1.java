package updateBits;

public class other1 {
	public static void main(String[] args) {
		System.out.println(updateBits(1024, 21, 2, 6));
		System.out.println(updateBits(0, 1, 2, 6));
		System.out.println(updateBits(2147483647, 3456, 11, 22));
	}

	// ������ʽ������� ��һ��������㷨
	public static int updateBits(int n, int m, int i, int j) {
		int mask;
		if (j < 31) {
			mask = ~((1 << (j + 1)) - (1 << i));
		} else {
			mask = (1 << i) - 1;
		}
		return (m << i) + (mask & n);
	}
}
