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
	 * 实际上这题应该是suppose n > 0的。
	 * 
	 * 我们利用 取模运算的乘法法则： http://baike.baidu.com/view/4887065.htm (a * b) % p = (a
	 * % p * b % p) % p
	 * 
	 * 将 a^n % b 分解为 (a^(n/2) * a^(n/2) * (a)) %b = ((a^(n/2) * a^(n/2))%b *
	 * (a)%b) %b ((a^(n/2) * a^(n/2))%b * (a)%b) %b = ((a^(n/2)%b * a^(n/2)%b)%b
	 * * (a)%b) %b
	 * 
	 * 实现如下：
	 * 
	 * 注意2个base case: n = 0 n = 1都要特别处理。因为n = 1时，会分解出一个pow(a, b, 1)，这个会不断循环调用。
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
