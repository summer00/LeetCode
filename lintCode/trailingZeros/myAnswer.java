package trailingZeros;

/**
 * ���һ���㷨�������n�׳���β����ĸ���
 * 
 * ����������ֵ�Ľ׳�:http://www.cnblogs.com/eaglet/archive/2009/08/20/1550311.html
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(trailingZeros(20));
		System.out.println(trailingZeros1(50));
	}

	public static long trailingZeros(long n) {
		long result = 1, count = 0;
		for (long i = n; i > 1; i--) {
			result *= i;
		}
		System.out.println(result);
		while (result > 0) {
			if (result % 10 == 0) {
				result /= 10;
				count++;
			} else {
				break;
			}
		}
		return count;
	}

	// ֻҪ������˵����ִ���5�ĸ���
	public static long trailingZeros1(long n) {
		long temp = n, count = 0;
		while (true) {
			if (temp == 0) {
				break;
			} else {
				temp /= 5;
				count += temp;
			}
		}
		return count;
	}
}
