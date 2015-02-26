import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Problem12_Cards_Frequencies {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String[] inputCards = sc.nextLine().split("\\W+");

		LinkedHashMap<String, Integer> cards = new LinkedHashMap<>();
		int totalCount = 0;

		for (String card : inputCards) {
			Integer count = cards.get(card);
			if (count == null) {
				count = 0;
			}
			cards.put(card, count + 1);
			totalCount++;
		}

		for (Entry<String, Integer> entry : cards.entrySet()) {
			// The frequency is calculated by the formula
			// appearances / N
			// and is expressed in percentages with exactly
			// 2 digits after the decimal point.
			double percentage = ((double) entry.getValue() / (double) totalCount) * 100;
			System.out.printf("%s -> %.2f", entry.getKey(), percentage);
			System.out.print("%\n");
		}
	}
}
