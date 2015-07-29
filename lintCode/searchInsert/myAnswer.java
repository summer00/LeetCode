package searchInsert;

/**
 * ����һ�����������һ��Ŀ��ֵ��������������ҵ�Ŀ��ֵ�򷵻����������û�У����ص������ᱻ��˳������λ�á�
 * 
 * ����Լ��������������ظ�Ԫ�ء�
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 7 };
		System.out.println(searchInsert(A, 9));
		System.out.println("hello!");
	}

	public static int searchInsert(int[] A, int target) {
		int left = 0, right = A.length - 1, mid = (left + right) / 2;
		while (left <= right) {
			if (A[mid] < target) {
				left = mid + 1;
			} else if (A[mid] > target) {
				right = mid - 1;
			} else {
				return mid;
			}
			mid = (left + right) / 2;
		}
		return left;
	}
}
