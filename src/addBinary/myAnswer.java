package addBinary;

public class myAnswer {
	public static void main(String[] args) {
		String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
		String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
		String c = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";
		System.out.println(addBinary1(a, b));
		System.out.println(addBinary1(a, b).equals(c));
		String dd = "2015\\08\\05\\hhhhhhhhhhhhhhhh4f19a179-a9a7-4aa9-aae4-f8191808bf8a.txt";
		System.out.println(dd.substring(dd.lastIndexOf("\\") + 1, dd.length()));
	}

	// 方法二：强行手动计算
	public static String addBinary1(String a, String b) {
		String max = a.length() > b.length() ? a : b;
		String min = a.length() > b.length() ? b : a;
		StringBuffer sb = new StringBuffer();
		boolean isIn = false;
		for (int i = max.length() - 1, j = min.length() - 1; i >= 0; i--, j--) {
			if (j >= 0) {
				if (isIn) {
					if (max.charAt(i) == '1' && min.charAt(j) == '1') {
						sb.append(1);
						isIn = true;
					} else if (max.charAt(i) == '1' || min.charAt(j) == '1') {
						sb.append(0);
						isIn = true;
					} else {
						sb.append(1);
						isIn = false;
					}
				} else {
					if (max.charAt(i) == '1' && min.charAt(j) == '1') {
						sb.append(0);
						isIn = true;
					} else if (max.charAt(i) == '1' || min.charAt(j) == '1') {
						sb.append(1);
						isIn = false;
					} else {
						sb.append(0);
						isIn = false;
					}
				}
			} else {
				if (isIn) {
					if (max.charAt(i) == '1') {
						sb.append(0);
						isIn = true;
					} else {
						sb.append(1);
						isIn = false;
					}
				} else {
					if (max.charAt(i) == '1') {
						sb.append(1);
						isIn = false;
					} else {
						sb.append(0);
						isIn = false;
					}
				}
			}
		}
		if (isIn) {
			sb.append(1);
		}
		return sb.reverse().toString();
	}

	// 方法一：将a,b分别转成int再加，再转回binary。对大数操作有问题。
	public static String addBinary(String a, String b) {
		char[] aArr = a.toCharArray(), bArr = b.toCharArray();
		int aa = toBinary(aArr), bb = toBinary(bArr);
		return Integer.toBinaryString(aa + bb);
	}

	private static int toBinary(char[] arr) {
		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1') {
				a += (1 << (arr.length - 1 - i));
			}
		}
		return a;
	}
}
