package maxPoints;

import common.Point;

/**
 * 最多有多少点在同一条直线上
 */
public class myAnswer {
	public static void main(String[] args) {
		Point[] points = Point.createPoint2();
		System.out.println(maxPoints(points));
	}

	public static int maxPoints(Point[] points) {
		if (points == null || points.length == 0) {
			return 0;
		} else if (points.length == 1) {
			return 1;
		}
		int result = 2;
		for (int i = 0; i < points.length - 2; i++) {
			double k = computeK(points[i].getX(), points[i + 1].getX(), points[i].getY(), points[i + 1].getY());
			int sum = 2;
			for (int j = i + 2; j < points.length; j++) {
				double kk = computeK(points[i].getX(), points[j].getX(), points[i].getY(), points[j].getY());
				if (Math.abs(k - kk) < 1e-6) {
					sum++;
				}
			}
			if (result < sum) {
				result = sum;
			}
		}
		return result;
	}

	private static double computeK(int x1, int x2, int y1, int y2) {
		if ((x1 - x2) == 0) {
			return 0;
		} else if ((y1 - y2) == 0) {
			return 1;
		} else {
			return (x1 - x2) / (double) (y1 - y2);
		}
	}

}
