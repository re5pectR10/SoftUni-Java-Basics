import java.util.Scanner;

public class _8_CountEqualBitPairs {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int number = line.nextInt();
		line.close();
		boolean isOne;
		int pairsCount = 0;
		int mask;
		int numLenght = numberLenght(number);
		if (number % 2 == 1) {
			isOne = true;
		} else {
			isOne = false;
		}
		
		for (int i = 1; i < numLenght; i++) {
			mask = 1 << i;
			if ((number & mask) == mask) {
				if (isOne) {
					pairsCount++;
				} else {
					isOne = true;
				}
			} else {
				if (isOne) {
					isOne = false;
				} else {
					pairsCount++;
				}
			}
		}
		
		System.out.println(pairsCount);
	}
	
	public static int numberLenght(int number) {
		
		int lenght = 0;
		while (number > 0) {
			lenght++;
			number /= 2;
		}
		
		return lenght;
	}

}
