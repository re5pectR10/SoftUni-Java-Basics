import java.util.Scanner;


public class _6_SumTwoNumbers {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int sum = 0;
		sum += line.nextInt();
		sum += line.nextInt();
		System.out.println(sum);
		line.close();

	}

}
