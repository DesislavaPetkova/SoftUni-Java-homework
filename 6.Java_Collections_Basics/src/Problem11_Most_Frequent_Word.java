import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem11_Most_Frequent_Word {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().toLowerCase().split("\\W+");
		Map<String, Integer> wordsTree = new TreeMap<>();

		for (String word : line) {
			Integer count = wordsTree.get(word);
			if (count == null) {
				count = 0;
			}
			wordsTree.put(word, count + 1);

		}
		int maxCount = 0;

		for (Object value : wordsTree.values()) {
			if (maxCount < (Integer) value) {
				maxCount = (Integer) value;
			}

		}

		for (Map.Entry<String, Integer> entry : wordsTree.entrySet()) {
			if (entry.getValue() == maxCount) {
				System.out.printf("%s -> %d times\n", entry.getKey(),
						entry.getValue());
			}

		}
	}
}