import java.util.Scanner;


public class _1_SymmetricNumbers {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int start = line.nextInt();
		int end = line.nextInt();
		int reverse;
		int temp;
		line.close();
		for (int i = start; i <= end; i++) {
			temp = i;
			reverse = 0;
			while (temp > 0) {
				reverse = reverse * 10 + temp % 10;
				temp /= 10;
			}
			
			if (i == reverse) {
				System.out.print(reverse + " ");
			}
		}
	}
}
