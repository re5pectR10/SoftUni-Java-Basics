import java.awt.Point;
import java.util.Scanner;


public class _2_TriangleArea {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		Point A = new Point(line.nextInt(), line.nextInt());
		Point B = new Point(line.nextInt(), line.nextInt());
		Point C = new Point(line.nextInt(), line.nextInt());
		int area = Math.abs((A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2);
		System.out.println(area);
		line.close();
	}

}
