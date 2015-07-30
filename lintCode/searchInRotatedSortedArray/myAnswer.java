package searchInRotatedSortedArray;

/**
 * ������һ������İ�δ֪����ת����ת������(���磬0 1 2 4 5 6 7 ���ܳ�Ϊ4 5 6 7 0 1 2)��
 * 
 * ����һ��Ŀ��ֵ����������������������ҵ�Ŀ��ֵ���������е�����λ�ã����򷵻�-1��
 * 
 * ����Լ��������в������ظ���Ԫ�ء�
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 0, 1, 2, 3, 4 };
		int[] B = { 2, 3, 4, 0, 1 };
		int[] C = { 4, 3, 2, 1, 0 };
		int[] D = { 0, 1, 2, 3, 4 };
		System.out.println(search(A, 1));
		System.out.println(search(B, 2));
		System.out.println(search(C, 2));
		System.out.println(search(D, 2));
	}

	public static int search(int[] A, int target) {
		int low = 0, high = A.length - 1, mid;
		while (low <= high) {
			mid = (low + high) >> 1;
			if (A[mid] == target) {
				return mid;
			}
			if (A[low] < A[mid]) { // �������
				if (target < A[mid] && target >= A[low]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else { // �ұ�����
				if (target > A[mid] && target <= A[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
}
