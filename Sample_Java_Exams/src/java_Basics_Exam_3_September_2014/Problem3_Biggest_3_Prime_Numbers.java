package java_Basics_Exam_3_September_2014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem3_Biggest_3_Prime_Numbers {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] nums = scan.nextLine().split("[( )]+");
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		int sum = 0;

		for (int i = 1; i < nums.length; i++) {
			int a = Integer.parseInt(nums[i]);
			if (a >= 1) {
				boolean prime = isPrime(a);
				if (prime && !primeNums.contains(a)) {
					primeNums.add(a);
				} else {
					continue;

				}
			}
		}
		Collections.sort(primeNums);
		Collections.reverse(primeNums);

		if (primeNums.size() <= 2) {
			System.out.println("No");
		} else {
			for (int i = 0; i < 3; i++) {
				sum += primeNums.get(i);
			}
			System.out.println(sum);
		}
	}

	private static boolean isPrime(int a) {
		int temp = Math.abs(a);
        if(a==1){
        return false;
        }
		for (int j = 2; j <= Math.sqrt(temp); j++) {
			if (a % j == 0) {
				return false;
			}
		}
		return true;

	}

}
