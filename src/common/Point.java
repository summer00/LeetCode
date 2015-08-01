package common;

public class Point {
	public int x;
	public int y;

	public Point() {
		x = 0;
		y = 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point(int a, int b) {
		x = a;
		y = b;
	}

	// (1, 2), (3, 6), (0, 0), (1, 3)
	public static Point[] createPoint() {
		Point[] pointArr = new Point[4];
		pointArr[0] = new Point(1, 2);
		pointArr[1] = new Point(3, 6);
		pointArr[2] = new Point(0, 0);
		pointArr[3] = new Point(1, 3);
		return pointArr;
	}

	// (1,1),(1,1),(1,1)
	public static Point[] createPoint1() {
		Point[] pointArr = new Point[3];
		pointArr[0] = new Point(1, 1);
		pointArr[1] = new Point(1, 1);
		pointArr[2] = new Point(1, 1);
		return pointArr;
	}

	// [-4,-4],[-8,-582],[-3,3],[-9,-651],[9,591]
	public static Point[] createPoint2() {
		Point[] pointArr = new Point[5];
		pointArr[0] = new Point(-4, -4);
		pointArr[1] = new Point(-8, -582);
		pointArr[2] = new Point(-3, -3);
		pointArr[3] = new Point(-9, -651);
		pointArr[4] = new Point(9, 591);
		return pointArr;
	}
}
