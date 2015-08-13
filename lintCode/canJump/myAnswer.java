package canJump;

/**
 * ����һ���Ǹ��������飬�������λ������ĵ�һ��λ�á�
 * 
 * �����е�ÿ��Ԫ�ش��������Ǹ�λ�ÿ�����Ծ����󳤶ȡ�
 * 
 * �ж����Ƿ��ܵ�����������һ��λ�á�
 */
public class myAnswer {
	public static void main(String[] args) {
		int[] A = { 2, 0, 1, 1, 4 };
		int[] B = { 3, 0, 1, 0, 4 };
		System.out.println(canJump(A));
		System.out.println(canJump(B));
	}

	public static boolean canJump(int[] A) {
		if (A.length == 0) {
			return false;
		}
		int step = A[0];
		for (int i = 0; i < A.length; i++) {
			if (step > 0) {
				step--;
				step = Math.max(step, A[i]);// ʣ��Ĳ����뵱ǰ���ߵĲ����Ƚϣ�ȡ���
			} else {
				return false;
			}
		}
		return true;
	}
}
