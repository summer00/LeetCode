package sqrt;

public class other1 {
	public static void main(String[] args) {
		System.out.println(sqrtByNewton(65535));
	}

	// 二分法
	public static int sqrtByBisection(int x) {
		int low = 0, high = x, mid = (low + high) / 2, last;
		do {
			if (mid * mid < x) {
				low = mid;
			} else if (mid * mid > x) {
				high = mid;
			} else {
				return mid;
			}
			last = mid;
			mid = (low + high) / 2;
		} while (Math.abs(mid - last) > 1); // 控制精度

		return mid;
	}

	// 牛顿法
	public static int sqrtByNewton(int x) {
		int val = x;// 最终
		int last;// 保存上一个计算的值
		do {
			last = val;
			val = (val + x / val) / 2;
		} while (Math.abs(val - last) > 1);
		return val;
	}
}
