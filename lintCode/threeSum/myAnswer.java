package threeSum;

import java.util.ArrayList;
import java.util.Arrays;

public class myAnswer {
	public static void main(String[] args) {
		int[] numbers = new int[] { 0, 0, 0, 0, 0 };
		ArrayList<ArrayList<Integer>> list = threeSum(numbers);
		for (ArrayList<Integer> l : list) {
			System.out.println(l);
		}
		System.out.println(list.size());
	}

	public static ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length - 2; i++) {
			// 如果i大于零，则三者之和不可能等于0
			if (numbers[i] > 0) {
				break;
			}
			if (i != 0 && numbers[i] == numbers[i - 1]) {
				continue;
			}
			int j = i + 1, k = numbers.length - 1;
			while (j < k) {
				if (-numbers[i] == numbers[j] + numbers[k]) {
					ArrayList<Integer> l = new ArrayList<>();
					l.add(numbers[i]);
					l.add(numbers[j]);
					l.add(numbers[k]);
					list.add(l);
					j++;
					k--;
					while (j < k && numbers[j] == numbers[j - 1]) {
						j++;
					}
					while (j < k && numbers[k] == numbers[k + 1]) {
						k--;
					}
				} else if (-numbers[i] > numbers[j] + numbers[k]) {
					j++;
				} else {
					k--;
				}
			}
		}
		return list;
	}
}
