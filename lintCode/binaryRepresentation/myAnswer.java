package binaryRepresentation;

/**
 * ���ֽ���ת�� http://www.cnblogs.com/fangfan/p/4086662.html
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(binaryRepresentation("0.0"));
		System.out.println(binaryRepresentation("3.35"));
	}

	public static String binaryRepresentation(String n) {
		StringBuffer i = new StringBuffer(), d = new StringBuffer();
		int ii = Integer.parseInt(n.split("\\.")[0]);
		double dd = Double.parseDouble("." + n.split("\\.")[1]);
		int iNum = 0, dNum = 0;
		while (ii != 0 && iNum < 32) {
			i.append((ii & 1) + "");
			ii = ii >> 1;
			iNum++;
		}
		while (dd != 0 && dNum < 32) {
			dd *= 2;
			d.append((int) (Math.floor(dd)) + "");
			dd -= Math.floor(dd);
			dNum++;
		}
		if (d.length() == 32) {
			return "ERROR";
		} else if (i.length() == 0 && d.length() == 0) {
			return "0";
		} else if (d.length() == 0) {
			return i.reverse().toString();
		} else if (i.length() == 0) {
			return "0." + d.toString();
		}
		return i.reverse().toString() + "." + d.toString();
	}
}
// 1������á�.����Ϊ�ָ��Ļ�������������д����String.split("\\."),����������ȷ�ķָ�����������String.split(".");
// 2������á�|����Ϊ�ָ��Ļ�������������д����String.split("\\|"),����������ȷ�ķָ�����������String.split("|");
// ��.���͡�|������ת���ַ�������ü�"\\";
// 3�������һ���ַ������ж���ָ����������á�|����Ϊ���ַ������磺��a=1 and b =2 or
// c=3��,���������ָ�������������String.split("and|or");
