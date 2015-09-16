package josephProblem;

import java.util.ArrayList;
import java.util.List;

public class myAnswer {
	
	public static void main(String[] args) {
		System.out.println(getLuckNum(8, 3));
	}

	public static int getLuckNum(int num, int count) {
		List<Integer> list = new ArrayList<>();
		int posion = 0, nowCount = 1;
		for (int i = 0; i < num; i++) {
			list.add(i + 1);
		}
		while (list.size() > 1) {
			nowCount++;
			posion++;
			if (posion == list.size()) {
				posion = 0;
			}
			if (nowCount % count == 0) {
				System.out.println(list + "remove" + posion);
				list.remove(posion);
				posion--;
			}
		}
		return list.get(0);
	}
}
