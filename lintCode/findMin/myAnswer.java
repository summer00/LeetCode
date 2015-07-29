package findMin;

/**
 * Ѱ����ת���������е���Сֵ
 * 
 * ����һ����ת�������������ʼλ����δ֪�ģ�����0 1 2 4 5 6 7 ���ܱ����4 5 6 7 0 1 2����
 * 
 * ����Ҫ�ҵ�������С��Ԫ�ء�
 * 
 * ����Լ��������в������ظ���Ԫ�ء�
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] num = { 3, 1, 2 };
		System.out.println(findMin1(num));
	}

	public static int findMin(int[] num) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < min) {
				min = num[i];
			}
		}
		return min;
	}

	public static int findMin1(int[] num) {
		int left = 0, right = num.length - 1, mid;
		while (left < right) {
			mid = (left + right) / 2;
			if (num[mid] > num[right]) {
				left = mid + 1;
			} else {
				right = mid;
			}
		}
		return num[left];
	}
}
