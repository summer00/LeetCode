package fastPower;

/**
 * http://www.cnblogs.com/yuzhangcmu/p/4174781.html
 * http://www.cnblogs.com/yuzhangcmu/
 */
public class others1 {
	public static void main(String[] args) {
		System.out.println(fastPower(2, 2147483647, 2147483647));
	}

	/**
	 * ʵ��������Ӧ����suppose n > 0�ġ�
	 * 
	 * �������� ȡģ����ĳ˷����� http://baike.baidu.com/view/4887065.htm (a * b) % p = (a
	 * % p * b % p) % p
	 * 
	 * �� a^n % b �ֽ�Ϊ (a^(n/2) * a^(n/2) * (a)) %b = ((a^(n/2) * a^(n/2))%b *
	 * (a)%b) %b ((a^(n/2) * a^(n/2))%b * (a)%b) %b = ((a^(n/2)%b * a^(n/2)%b)%b
	 * * (a)%b) %b
	 * 
	 * ʵ�����£�
	 * 
	 * ע��2��base case: n = 0 n = 1��Ҫ�ر�����Ϊn = 1ʱ����ֽ��һ��pow(a, b, 1)������᲻��ѭ�����á�
	 */
	public static int fastPower(int a, int b, int n) {
		if (n == 1) {
			return a % b;
		}
		if (n == 0) {
			return 1 % b;
		}

		long product = fastPower(a, b, n / 2);
		product = (product * product) % b;
		if (n % 2 == 1) {
			product = (product * a) % b;
		}
		return (int) product;
	}
}
