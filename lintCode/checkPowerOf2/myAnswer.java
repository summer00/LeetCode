package checkPowerOf2;

public class myAnswer {
	public static void main(String[] args) {
		System.out.println(checkPowerOf2(9));
	}

	public static boolean checkPowerOf2(int n) {
		return n > 0 && ((n & (n - 1)) == 0);
	}
}
