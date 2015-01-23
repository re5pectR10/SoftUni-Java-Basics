import java.util.Scanner;

public class _6_FormattingNumbers {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int a = line.nextInt();
		float b = line.nextFloat();
		float c = line.nextFloat();
		String output = "|" + String.format("%1$-10s", Integer.toHexString(a).toUpperCase()) + 
				"|" + String.format("%1$10s", Integer.toBinaryString(a)).replace(' ', '0') + 
				"|" + String.format("%1$10s", String.format("%.2f", b)) + 
				"|" + String.format("%1$-10s", String.format("%.3f", c)) + "|";
		System.out.println(output);
		line.close();

	}
}
