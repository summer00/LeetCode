package threeSum;

import java.util.ArrayList;
import java.util.Arrays;

public class others1 {
	private ArrayList<ArrayList<Integer>> list;

	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		list = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);

		int i = 0;
		for (i = 0; i <= num.length - 3; i++) {
			if (i != 0 && num[i] == num[i - 1]) {
				continue;
			}
			judgeAndPut(num, i, i + 1, num.length - 1);
		}

		return list;
	}

	private void judgeAndPut(int[] num, int i, int p, int q) {
		while (p < q) {
			if (num[p] + num[q] < -num[i]) {
				p++;
			} else if (num[p] + num[q] > -num[i]) {
				q--;
			} else if (num[p] + num[q] == -num[i]) {
				ArrayList<Integer> tmpList = new ArrayList<Integer>();
				tmpList.add(num[i]);
				tmpList.add(num[p]);
				tmpList.add(num[q]);
				list.add(tmpList);
				p++;
				q--;
				while (p < q && num[p] == num[p - 1]) {
					p++;
				}
				while (p < q && num[q] == num[q + 1]) {
					q--;
				}
			}
		}
	}

	public static void main(String[] args) {
		int num[] = { -1,1,0 };
		System.out.println(new others1().threeSum(num));
	}
}
