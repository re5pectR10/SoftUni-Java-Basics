
public class _3_FullHouse {

	public static void main(String[] args) {

		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		char[] suits = { '\u2660', '\u2663', '\u2666', '\u2665' };
		int fullHouseCount = 0;
		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				for (int k = j + 1; k < suits.length; k++) {
					for (int l = k + 1; l < suits.length; l++) {
						for (int n = 0; n < faces.length; n++) {
							if (n == i) {
								continue;
							}
							
							for (int m = 0; m < suits.length; m++) {
								for (int z = m + 1; z < suits.length; z++) {
									fullHouseCount++;									
									System.out.print("(" + faces[i] + suits[j] + " " + faces[i] + suits[k] + " " + faces[i] + suits[l] + 
											" " + faces[n] + suits[m] + " " + faces[n] + suits[z] + ") ");
								}
							}
						}
					}
				}
			}
		}

		System.out.println();
		System.out.println(fullHouseCount);
	}
}
