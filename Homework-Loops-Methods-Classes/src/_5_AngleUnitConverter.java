import java.util.Scanner;


public class _5_AngleUnitConverter {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int numbersCount = line.nextInt();
		line.nextLine();
		String[] input = new String[numbersCount];
		for (int i = 0; i < numbersCount; i++) {
			input = line.nextLine().split("\\s");
			if (input[1].equals("rad")) {
				System.out.printf("%.6f deg", toDeg(Double.parseDouble(input[0])));
				System.out.println();
			} else {
				System.out.printf("%.6f rad", toRad(Double.parseDouble(input[0])));
				System.out.println();
			}
		}

		line.close();
	}
	
	public static double toDeg(double num) {
		
		return num * (180 / Math.PI);
	}
	
	public static double toRad(double num) {
		
		return num * (Math.PI / 180); 
	}

}
