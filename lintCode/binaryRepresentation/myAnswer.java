package binaryRepresentation;

/**
 * 各种进制转换 http://www.cnblogs.com/fangfan/p/4086662.html
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
// 1、如果用“.”作为分隔的话，必须是如下写法：String.split("\\."),这样才能正确的分隔开，不能用String.split(".");
// 2、如果用“|”作为分隔的话，必须是如下写法：String.split("\\|"),这样才能正确的分隔开，不能用String.split("|");
// “.”和“|”都是转义字符，必须得加"\\";
// 3、如果在一个字符串中有多个分隔符，可以用“|”作为连字符，比如：“a=1 and b =2 or
// c=3”,把三个都分隔出来，可以用String.split("and|or");
