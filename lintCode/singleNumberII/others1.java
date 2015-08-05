package singleNumberII;

/**
 * ����3*n + 1 �������֣�������һ������֮������ÿ�����־��������Σ��ҵ�������֡�
 */
public class others1 {
	public static void main(String[] args) {
		int[] A = { 1, 1, 2, 3, 3, 3, 2, 2, 4, 1 };
		System.out.println(singleNumberII(A));
	}

	/**
	 * ����ones��¼�����г�����ģ3��1�ε�bit��twos��¼������2�ġ�not_threes�ǵ�һ��bit���ֵ�3�ε�ʱ�򣬰��������
	 * ������ones�������Ŀ���Ǹ��������������1�Σ���Ȼ����ǳ���2�εĻ���Ӧ�����twos
	 * http://www.acmerblog.com/leetcode-single-number-ii-5394.html
	 */
	public static int singleNumberII(int[] A) {
		int once = 0;
		int twice = 0;

		for (int i = 0; i < A.length; i++) {
			twice |= once & A[i];
			once ^= A[i];
			int not_three = ~(once & twice);
			once = not_three & once;
			twice = not_three & twice;
		}
		return once;
	}
}
