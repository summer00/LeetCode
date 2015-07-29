package findFirstBadVersion;

/**
 * 代码库的版本号是从 1 到 n 的整数。某一天，有人提交了错误版本的代码，因此造成自身及之后版本的代码在单元测试中均出错。
 * 
 * 请找出第一个错误的版本号。
 * 
 * 你可以通过 isBadVersion 的接口来判断版本号 version 是否在单元测试中出错，具体接口详情和调用方法请见代码的注释部分。
 * 
 * 给出 n=5
 * 
 * 调用isBadVersion(3)，得到false
 * 
 * 调用isBadVersion(5)，得到true
 * 
 * 调用isBadVersion(4)，得到true
 * 
 * 此时我们可以断定4是第一个错误的版本号
 */
public class myAnswer {
	public static void main(String[] args) {
		System.out.println(findFirstBadVersion(10));
	}

	public static int findFirstBadVersion(int n) {
		if (n != 1) {
			int low = 0, high = n, mid;
			while (low <= high) {
				mid = (low + high) / 2;
				if (!isBadVersion(mid)) {
					low = mid + 1;
				} else {
					if (!isBadVersion(mid - 1)) {
						return mid;
					}
					high = mid - 1;
				}
			}
		}
		return 1;
	}

	public static boolean isBadVersion(int k) {
		switch (k) {
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return true;
		case 7:
			return true;
		case 8:
			return true;
		case 9:
			return true;
		case 10:
			return false;
		}
		return false;
	}

}
