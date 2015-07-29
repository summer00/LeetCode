package findFirstBadVersion;

/**
 * �����İ汾���Ǵ� 1 �� n ��������ĳһ�죬�����ύ�˴���汾�Ĵ��룬����������֮��汾�Ĵ����ڵ�Ԫ�����о�����
 * 
 * ���ҳ���һ������İ汾�š�
 * 
 * �����ͨ�� isBadVersion �Ľӿ����жϰ汾�� version �Ƿ��ڵ�Ԫ�����г�������ӿ�����͵��÷�����������ע�Ͳ��֡�
 * 
 * ���� n=5
 * 
 * ����isBadVersion(3)���õ�false
 * 
 * ����isBadVersion(5)���õ�true
 * 
 * ����isBadVersion(4)���õ�true
 * 
 * ��ʱ���ǿ��Զ϶�4�ǵ�һ������İ汾��
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(findFirstBadVersion(10));
	}

	public static int findFirstBadVersion(int n) {
		if (n != 1) {
			int low = 0, high = n, mid;
			while (low <= high) {
				mid = (low + high) / 2;
				if (!isBadVersion(mid)) {
					low = mid + 1;
				} else {
					if (!isBadVersion(mid - 1)) {
						return mid;
					}
					high = mid - 1;
				}
			}
		}
		return 1;
	}

	public static boolean isBadVersion(int k) {
		switch (k) {
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return true;
		case 7:
			return true;
		case 8:
			return true;
		case 9:
			return true;
		case 10:
			return false;
		}
		return false;
	}

}
