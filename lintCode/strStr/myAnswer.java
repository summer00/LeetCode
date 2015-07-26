package strStr;

/**
 * �ַ������ң��ֳƲ������ַ����������ַ���������һ�������õĺ��������������ʵ����������� ����һ�������� source �ַ�����һ��
 * target�ַ�������Ӧ���� source �ַ������ҳ� target �ַ������ֵĵ�һ��λ��(��0��ʼ)�� ��������ڣ��򷵻� -1��
 * 
 * KMP�㷨���⣺http://www.matrix67.com/blog/archives/115
 * �ַ���ƥ���㷨�Ƚϣ�http://blog.csdn.net/airfer/article/details/8951802
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(strStr("", ""));
	}

	public static int strStr(String source, String target) {
		if (source != null && target != null) {
			if (source.length() == 0 && target.length() == 0) {
				return 0;
			}
			for (int i = 0; i < source.length(); i++) {
				int j = 0;
				for (; j < target.length(); j++) {
					if (source.charAt(i + j) != target.charAt(j)) {
						break;
					}
				}
				if (j == target.length()) {
					return i;
				}
			}
		}
		return -1;
	}
}
