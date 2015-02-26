package java_Basics_Exam_27_May_2014;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Problem2_Three_Largest_Numbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		BigDecimal[] nums = new BigDecimal[n];
		for (int i = 0; i < n; i++) {
			String line1=scan.nextLine();
					nums[i]=new BigDecimal(line1);
		}
		Arrays.sort(nums);
		int count=3;
		for (int i = n-1; i >=0 && count>0; i--,count--) {
			System.out.println(nums[i].toPlainString());
		}
		
		
	}

}
