import java.util.Scanner;


public class _9_PointsInsideHouse {

	public static void main(String[] args) {
		
		Scanner line = new Scanner(System.in);
		float x = line.nextFloat();
		float y = line.nextFloat();
		boolean inTriangle = (17.5 - 12.5) * (y - 8.5) - (3.5 - 8.5) * (x - 12.5) >= 0 &&
				(17.5 - 22.5) * (y - 8.5) - (3.5 - 8.5) * (x - 22.5) <= 0 &&
				y <= 8.5 && y >= 3.5;
		if (inTriangle || 
				(x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) ||
				(x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
		
		line.close();

	}

}
