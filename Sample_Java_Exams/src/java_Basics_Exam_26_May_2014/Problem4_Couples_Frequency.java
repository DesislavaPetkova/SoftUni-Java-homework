package java_Basics_Exam_26_May_2014;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Problem4_Couples_Frequency {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] line = scan.nextLine().split("\\s+");
		int totalPairs = 0;
		LinkedHashMap<String, Integer> couplesMap = new LinkedHashMap<>();
		for (int i = 0; i < line.length - 1; i++) {
			if (line[i].equals("")) {
				continue;
			}

			String couples = line[i] + " " + line[i + 1];
			if (couplesMap.containsKey(couples)) {
				int count = couplesMap.get(couples);
				couplesMap.put(couples, count + 1);
			} else {

				couplesMap.put(couples, 1);
			}
			totalPairs++;

		}

		for (String pair : couplesMap.keySet()) {
			int count = couplesMap.get(pair);
			double percent = (double) count / totalPairs * 100;
			System.out.printf("%s -> %.2f%%", pair, percent);
			System.out.println();

		}
	}
}
