package canCompleteCircuit;

/**
 * ��һ����·���� N ������վ�����е� i ������վ������gas[i]�����Ҵӵ�_i_������վǰ����_i_+1������վ��Ҫ��������cost[i]��
 * 
 * ����һ�������������޴������������Ҫ��ĳһ������վ�����ƻ�·һ�ܣ�һ��ʼ����Ϊ�ա�
 * 
 * ��ɻ��ƻ�·һ��ʱ�����ļ���վ�ı�ţ��������ڻ���һ�ܵķ������򷵻�-1��
 */
public class myAnswer {
	public static void main(String[] args) {
		// 3
		int[] gas = { 1, 2, 3, 4, 5 }, cost = { 3, 4, 5, 1, 2 };
		// 2
		int[] gas1 = { 1, 1, 3, 1 }, cost1 = { 2, 2, 1, 1 };
		// 0
		int[] gas2 = { 2, 0, 1, 2, 3, 4, 0 }, cost2 = { 0, 1, 0, 0, 0, 0, 11 };
		// 74
		int[] gas3 = { 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
				91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
				19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44,
				45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66 },
				cost3 = { 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
						50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73,
						74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97,
						98, 99, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23,
						24, 25, 26 };
		// -1
		int[] gas4 = { 2, 4 }, cost4 = { 3, 4 };
		System.out.println(canCompleteCircuit(gas, cost));// 3
		System.out.println(canCompleteCircuit(gas1, cost1));// 2
		System.out.println(canCompleteCircuit(gas2, cost2));// 0
		System.out.println(canCompleteCircuit(gas3, cost3));// 74
		System.out.println(canCompleteCircuit(gas4, cost4));// -1
	}

	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int last = 0, result = -1, all = 0;
		for (int i = 0; i < cost.length; i++) {
			last += gas[i] - cost[i];
			all += gas[i] - cost[i];
			if (last >= 0 && result == -1) {
				result = i;
			} else if (last < 0) {
				last = 0;
				result = -1;
			}
		}
		if (all < 0) {
			return -1;
		}
		return result;
	}
}
