package longestWords;

import java.util.ArrayList;

public class myAnswer {
	public static void main(String[] args) {
		String[] dictionary = { "like", "love", "hate", "yes" };
		System.out.println(longestWords(dictionary));
	}

	public static ArrayList<String> longestWords(String[] dictionary) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> temp = new ArrayList<>();
		for (int i = 0, j = 0; i < dictionary.length; i++) {
			if (i == 0) {
				list.add(dictionary[i]);
				temp.add(dictionary[i]);
				j++;
			} else {
				if (list.get(j - 1).length() < dictionary[i].length()) {
					list.removeAll(temp);
					list.add(dictionary[i]);
					temp.add(dictionary[i]);
					j = 1;
				} else if (list.get(j - 1).length() == dictionary[i].length()) {
					list.add(dictionary[i]);
					temp.add(dictionary[i]);
					j++;
				}
			}
		}
		return list;
	}
}
