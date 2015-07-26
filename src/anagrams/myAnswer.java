package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class myAnswer {

	public static void main(String[] args) {
		System.out.println(anagrams(new String[] { "lint", "intl", "inlt", "code" }));
	}

	public static List<String> anagrams(String[] strs) {
		List<String> list = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			char[] c = strs[i].toCharArray();
			Arrays.sort(c);
			List<String> l = map.get(new String(c));
			if (l == null) {
				l = new ArrayList<>();
			}
			l.add(strs[i]);
			map.put(new String(c), l);
		}
		for (List<String> l : map.values()) {
			if (l.size() > 1) {
				list.addAll(l);
			}
		}
		return list;
	}

}
