package replaceBlank;

/**
 * ���һ�ַ�������һ���ַ����е����пո��滻�� %20 ��
 * 
 * ����Լ�����ַ������㹻�Ŀռ��������µ��ַ�������õ����ǡ���ʵ�ġ��ַ����ȡ�
 */
public class myAnswer {
	public static void main(String[] args) {
		String s = "Mr John Smith";
		char[] string = new char[20];
		string = s.toCharArray();
		System.out.println(replaceBlank(string, 13));
	}

	public static int replaceBlank(char[] string, int length) {
		int spaceNum = 0;
		for (int i = 0; i < length; i++) {
			if (string[i] == ' ') {
				spaceNum++;
			}
		}
		int newL = length + spaceNum * 2;
		int longIndex = newL - 1, shortIndex = length - 1;
		while (longIndex != shortIndex) {
			if (string[shortIndex] == ' ') {
				shortIndex--;
				string[longIndex--] = '0';
				string[longIndex--] = '2';
				string[longIndex--] = '%';
			} else {
				string[longIndex--] = string[shortIndex--];
			}
		}
		return newL;
	}
}
