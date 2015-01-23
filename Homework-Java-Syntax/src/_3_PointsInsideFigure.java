import java.util.Scanner;

public class _3_PointsInsideFigure {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		float x = line.nextFloat();
		float y = line.nextFloat();
		if ((x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5) || 
				(x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5) ||
				(x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5)) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
		
		line.close();

	}

}
