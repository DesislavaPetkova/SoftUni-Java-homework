package java_Basics_Exam_1_June_2014;

import java.util.Scanner;

public class Problem2_Sum_Cards {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		int prevValue = -1;
		int value = 0;
		int count = 0;
		int sum = 0;
		for (String card : line) {
			if (card.startsWith("2")) {
				value = 2;
			}
			if (card.startsWith("3")) {
				value = 3;
			}
			if (card.startsWith("4")) {
				value = 4;
			}
			if (card.startsWith("5")) {
				value = 5;
			}
			if (card.startsWith("6")) {
				value = 6;
			}
			if (card.startsWith("7")) {
				value = 7;
			}
			if (card.startsWith("8")) {
				value = 8;
			}
			if (card.startsWith("9")) {
				value = 9;
			}
			if (card.startsWith("10")) {
				value = 10;
			}
			if (card.startsWith("J")) {
				value = 12;
			}
			if (card.startsWith("Q")) {
				value = 13;
			}
			if (card.startsWith("K")) {
				value = 14;
			}
			if (card.startsWith("A")) {
				value = 15;
			}

			if (value == prevValue) {
				count++;
			} else {
				count = 1;
			}
			sum = sum + value;
			if (count == 2) {
				sum = sum + 2 * value;
			}
			if (count > 2) {
				sum = sum + value;
			}
			prevValue = value;
		}

		System.out.println(sum);
	}

}
