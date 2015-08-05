package longestCommonSubstring;

public class others1 {

	public static void main(String[] args) {
		System.out.println(longestCommonSubstring("afgace", "ac"));
		// getLCString("abcd", "ac");
	}

	public static int longestCommonSubstring(String A, String B) {
		int result = 0;
		if (A.length() != 0 && B.length() != 0) {
			int[][] max = new int[A.length()][B.length()];
			for (int i = 0; i < A.length(); i++) {
				for (int j = 0; j < B.length(); j++) {
					if (A.charAt(i) == B.charAt(j)) {
						if (i == 0 || j == 0) {
							max[i][j] = 1;
						} else {
							max[i][j] = max[i - 1][j - 1] + 1;
						}
					}
				}
			}
			for (int i = 0; i < max.length; i++) {
				for (int j = 0; j < max[i].length; j++) {
					if (result < max[i][j]) {
						result = max[i][j];
					}
				}
			}
		}
		return result;
	}

	public static void getLCString(String A, String B) {
		char[] str1 = A.toCharArray();
		char[] str2 = B.toCharArray();
		int i, j;
		int len1, len2;
		len1 = str1.length;
		len2 = str2.length;
		int maxLen = len1 > len2 ? len1 : len2;
		int[] max = new int[maxLen];
		int[] maxIndex = new int[maxLen];
		int[] c = new int[maxLen]; // ��¼�Խ����ϵ����ֵ�ĸ���

		for (i = 0; i < len2; i++) {
			for (j = len1 - 1; j >= 0; j--) {
				if (str2[i] == str1[j]) {
					if ((i == 0) || (j == 0))
						c[j] = 1;
					else
						c[j] = c[j - 1] + 1;
				} else {
					c[j] = 0;
				}

				if (c[j] > max[0]) { // ����Ǵ�������ʱֻ��һ�������,����Ҫ�Ѻ������0;
					max[0] = c[j]; // ��¼�Խ���Ԫ�ص����ֵ��֮���ڱ���ʱ������ȡ�Ӵ��ĳ���
					maxIndex[0] = j; // ��¼�Խ���Ԫ�����ֵ��λ��

					for (int k = 1; k < maxLen; k++) {
						max[k] = 0;
						maxIndex[k] = 0;
					}
				} else if (c[j] == max[0]) { // �ж������ͬ���ȵ��Ӵ�
					for (int k = 1; k < maxLen; k++) {
						if (max[k] == 0) {
							max[k] = c[j];
							maxIndex[k] = j;
							break; // �ں����һ����Ҫ�˳�ѭ����
						}

					}
				}
			}
		}

		for (j = 0; j < maxLen; j++) {
			if (max[j] > 0) {
				System.out.println("��" + (j + 1) + "�������Ӵ�:");
				for (i = maxIndex[j] - max[j] + 1; i <= maxIndex[j]; i++) {
					System.out.print(str1[i]);
				}
				System.out.println("");
			}
		}
	}

}
