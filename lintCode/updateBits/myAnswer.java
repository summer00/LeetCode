package updateBits;

/**
 * ��������32λ������N��M���Լ�����������λ��λ��i��j��
 * 
 * дһ��������ʹ��N�еĵ�i��jλ����M��M����N�дӵ�iΪ��ʼ����jλ���Ӵ���
 * 
 * ���� ����N = (10000000000)2��M = (10101)2�� i = 2, j = 6
 * 
 * ���� N = (10001010100)2
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(updateBits(1024, 21, 2, 6));
		System.out.println(updateBits(0, 1, 2, 6));
		System.out.println(updateBits(2147483647, 3456, 11, 22));
	}

	// ����С����������� ��һ��������㷨
	public static int updateBits(int n, int m, int i, int j) {
		return n - n % (2 << j) + n % (2 << i) + (m << i);
	}

	public static int updateBits1(int n, int m, int i, int j) {
		int mask;
		if (j < 31) {
			mask = ~(1 << (j + 1)) - (1 << i);
		} else {
			mask = (1 << i) - 1;
		}
		return (m << i) + (n & mask);
	}
}
