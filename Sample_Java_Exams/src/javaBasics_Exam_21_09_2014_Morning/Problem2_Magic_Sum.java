package javaBasics_Exam_21_09_2014_Morning;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2_Magic_Sum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int devider = Integer.parseInt(scan.nextLine());
		ArrayList<Integer> nums = new ArrayList<>();
		String number;

		while (true) {
			number = scan.nextLine();
			if (number.equals("End")) {
				break;
			}
			nums.add(Integer.parseInt(number));
		}

		int a, b, c;
		int sum = 0;
		long highSum = Integer.MIN_VALUE;
		int[] deviders = new int[3];
		boolean any = false;
		for (int i = 0; i < nums.size() - 2; i++) {
			a = nums.get(i);
			for (int j = 1; j < nums.size() - 1; j++) {
				b = nums.get(j);
				for (int j2 = 2; j2 < nums.size(); j2++) {
					c = nums.get(j2);
					sum = a + b + c;
					if (sum % devider == 0 && i != j && j != j2 && j2 != i) {
						if (highSum < sum) {
							highSum = sum;
							any = true;
							deviders[0] = a;
							deviders[1] = b;
							deviders[2] = c;
						}
					}
				}
			}
		}
		if (!any) {
			System.out.println("No");
		} else {
			System.out.printf("(%d + %d + %d) %% %d = 0", deviders[0],
					deviders[1], deviders[2], devider);
		}

	}

}
