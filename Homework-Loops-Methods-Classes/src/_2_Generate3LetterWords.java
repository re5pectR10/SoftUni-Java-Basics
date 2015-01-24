import java.util.Scanner;


public class _2_Generate3LetterWords {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		char[] charachters = line.nextLine().toCharArray();
		line.close();
		for (int i = 0; i < charachters.length; i++) {
			for (int j = 0; j < charachters.length; j++) {
				for (int k = 0; k < charachters.length; k++) {
					System.out.print("" + charachters[i] + charachters[j] + charachters[k] + " ");
				}
			}
		}
	}
}
