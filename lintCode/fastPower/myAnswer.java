package fastPower;

/**
 * ����a(n��) % b������a��b��n����32λ��������
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(fastPower(2, 10, 5));
	}

	public static int fastPower(int a, int b, int n) {
		System.out.println(Math.pow(a, n) % b);

		return a % b;
	}
}
