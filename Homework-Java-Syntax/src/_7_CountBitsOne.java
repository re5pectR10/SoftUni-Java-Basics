import java.util.Scanner;

public class _7_CountBitsOne {

	private static final int BITS_COUNT = 32;

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int number = line.nextInt();
		int mask;
		int onesCount = 0;
		line.close();

		for (int i = 0; i < BITS_COUNT; i++) {
			mask = 1 << i;
			if ((mask & number) == mask) {
				onesCount++;
			}
		}
		
		System.out.println(onesCount);
	}

}
