import java.util.Scanner;


public class _4_SmallestOf3 {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		System.out.println(Math.min(line.nextFloat(), Math.min(line.nextFloat(), line.nextFloat())));
		line.close();

	}

}
