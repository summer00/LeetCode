package searchInsert;

/**
 * ����һ�����������һ��Ŀ��ֵ��������������ҵ�Ŀ��ֵ�򷵻����������û�У����ص������ᱻ��˳������λ�á�
 * 
 * ����Լ��������������ظ�Ԫ�ء�
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 1, 3 };
		System.out.println(searchInsert(A, 2));
	}

	public static int searchInsert(int[] A, int target) {
		if (A.length == 0) {
			return 0;
		}
		int left = 0, right = A.length - 1, mid = (left + right) / 2;
		while (left <= right) {
			if (A[mid] < target) {
				left = mid;
			} else if (A[mid] > target) {
				right = mid - 1;
			} else {
				return mid + 1;
			}
			mid = (left + right) / 2;
		}
		return mid + 1;
	}
}
