import java.util.Scanner;


public class _6_RandomHandsOf5Cards {

	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		int cardsPerHand = 5;
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		char[] suits = { '\u2660', '\u2663', '\u2666', '\u2665' };
		int handsCount = line.nextInt();
		String[] currentHand = new String[5];
		String currentCard;
		line.close();
		for (int i = 0; i < handsCount; i++) {
			for (int j = 0; j < cardsPerHand; j++) {
				currentCard = faces[(int)(Math.random() * 13)] + suits[(int)(Math.random() * 4)];
				for (int k = j; k > 0; k--) {
					while (currentCard.equals(currentHand[k])) {
						currentCard = faces[(int)(Math.random() * 13)] + suits[(int)(Math.random() * 4)];
					}
				}
				
				currentHand[j] = currentCard;
			}
			
			for (int j = 0; j < currentHand.length; j++) {
				System.out.print(currentHand[j] + " ");
			}
			
			System.out.println();
		}
	}

}
