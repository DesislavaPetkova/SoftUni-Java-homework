import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem6_Random_Hands_5_Cards {

	public static void main(String[] args) {

		String[] face = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] suit = { '\u2660', '\u2665', '\u2666', '\u2663' };

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int hands = Integer.parseInt(input.nextLine());

		ArrayList<String> deck = new ArrayList<String>(52);

		for (int i = 0; i < face.length; i++) { // creates a deck of 52 cards
			for (int j = 0; j < suit.length; j++) {
				String card = face[i] + suit[j];
				deck.add(card);
			}
		}

		for (int i = 0; i < hands; i++) {
			Collections.shuffle(deck); // shuffles the deck "hand" times

			for (int j = 0; j < 5; j++) {
				System.out.printf("%s ", deck.get(j)); // prints the first 5
														// cards from the
														// shuffled deck
			}
			System.out.println();
		}

	}

}
