
public class _4_FullHouseJokers {

	public static void main(String[] args) {

		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		char[] suits = { '\u2660', '\u2663', '\u2666', '\u2665' };
		String[] currentHand = new String[5];
		int fullHouseCount = 0;
		int mask;
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
									currentHand[0] = faces[i] + suits[j];
									currentHand[1] = faces[i] + suits[k];
									currentHand[2] = faces[i] + suits[l];
									currentHand[3] = faces[n] + suits[m];
									currentHand[4] = faces[n] + suits[z];
									for (int o = 0; o < 31; o++) {
										fullHouseCount++;
										for (int q = 0; q < 5; q++) {
											mask = 1 << q;
											if ((o & mask) == mask) {
												currentHand[q] = "*";
											}
										}
										
										System.out.print("(" + currentHand[0] + " " + currentHand[1] + " " + currentHand[2] + 
											" " + currentHand[3] + " " + currentHand[4] + ") ");
									}
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
