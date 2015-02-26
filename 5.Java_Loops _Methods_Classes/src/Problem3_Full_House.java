
public class Problem3_Full_House {

	public static void main(String[] args) {

		String[] cards = new String[52];
		String[] cardType = { "A", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "J", "Q", "K" };
		char[] cardSymbol = { '\u2660', '\u2665', '\u2666', '\u2663' };

		int countFH = 0;

		for (int i = 0, indx = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++, indx++) {

				cards[indx] = cardType[i] + cardSymbol[j];
			}
		}

		for (int n = 0; n < 13; n++) {
			for (int a = n * 4; a < (n * 4 + 4); a++) {
				for (int b = a + 1; b < (n * 4 + 4); b++) {
					for (int c = b + 1; c < (n * 4 + 4); c++) {

						for (int m = 0; m < 13; m++) {
							if (n != m) {
								for (int d = m * 4; d < (m * 4 + 4); d++) {
									for (int e = d + 1; e < (m * 4 + 4); e++) {
										System.out.printf("%s5 %s %s %s %s \n",
												cards[a], cards[b], cards[c],
												cards[d], cards[e]);
										countFH++;
									}
								}
							}
						}

					}
				}
			}
		}
		System.out.println(countFH);
	}

}
