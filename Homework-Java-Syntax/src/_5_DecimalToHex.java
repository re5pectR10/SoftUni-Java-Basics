import java.util.Scanner;


public class _5_DecimalToHex {

	public static void main(String[] args) {

		Scanner line =new Scanner(System.in);
		System.out.println(Integer.toHexString(line.nextInt()).toUpperCase());
		line.close();

	}

}
