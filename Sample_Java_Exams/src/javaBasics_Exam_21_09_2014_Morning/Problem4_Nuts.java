package javaBasics_Exam_21_09_2014_Morning;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem4_Nuts {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		TreeMap<String, LinkedHashMap<String, Integer>> orders = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			String input = scan.nextLine();
			input = input.substring(0, input.length() - 2);
			String[] line = input.split(" ");
			String company = line[0];
			String nut = line[1];
			int amount = Integer.parseInt(line[2]);

			if (!orders.containsKey(company)) {
				orders.put(company, new LinkedHashMap<String, Integer>());
				orders.get(company).put(nut, amount);
			} else {
				if (!orders.get(company).containsKey(nut)) {
					orders.get(company).put(nut, amount);
				} else {
					int oldAmount = orders.get(company).get(nut);
					orders.get(company).put(nut, oldAmount + amount);
				}
			}
		}
		for (String company : orders.keySet()) {
			System.out.printf("%s: ", company);
			int counter = 1;
			String result = orders.get(company).toString()
					.replaceAll("[{}]", "");
			result = result.replace(",", "kg,");
			System.out.println(result.replace("=", "-") + "kg");
		}

	}

}
