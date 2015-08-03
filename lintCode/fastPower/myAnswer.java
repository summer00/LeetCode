package fastPower;

/**
 * ����a(n��) % b������a��b��n����32λ��������
 * 
 * ��ȡģ�㷨 http://blog.csdn.net/chen77716/article/details/7093600
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(fastPower(6, 7, 3));
	}

	public static int fastPower(int a, int b, int n) {
		int result = 1;
		int base = a;
		while (b > 0) {
			if ((b & 1) == 1) {
				result = (result * base) % n;
			}
			base = (base * base) % n;
			b >>>= 1;
		}
		return result;
	}
}
