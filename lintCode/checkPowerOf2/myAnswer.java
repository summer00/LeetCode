package checkPowerOf2;
/**
 * 检查是否是2的幂
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(checkPowerOf2(9));
	}

	public static boolean checkPowerOf2(int n) {
		return n > 0 && ((n & (n - 1)) == 0);
	}
}
