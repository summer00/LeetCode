package uniquePaths;

public class myAnswer {
	public static void main(String[] args) {
		System.out.println(uniquePaths(1, 1));
	}

	public static int uniquePaths(int m, int n) {
		int step = 0;
		while (m-- > 0 && n-- > 0) {
			step += 2;
		}
		return step;
	}
}
