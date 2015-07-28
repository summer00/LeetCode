package sqrt;

public class myAnswer {
	public static void main(String[] args) {
		System.out.println(sqrt(1));
		System.out.println(sqrt(65535));
	}

	public static int sqrt(int x) {
		if (x == 1) {
			return 1;
		}
		long i = 1;
		for (; i < x / 2; i++) {
			if (i * i > x) {
				break;
			}
		}
		return (int) (i - 1);
	}
}
