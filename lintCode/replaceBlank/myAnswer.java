package replaceBlank;

/**
 * 设计一种方法，将一个字符串中的所有空格替换成 %20 。
 * 
 * 你可以假设该字符串有足够的空间来加入新的字符，且你得到的是“真实的”字符长度。
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
