package java_Basics_Exam_1_June_2014;

import java.util.Scanner;

public class Problem1_tuck_Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] nums=new int[n];
		for (int i = 0; i < n; i++) {
			nums[i]=scan.nextInt();
		}
		boolean matched=true;
		for (int i = 0; i < n; i++) {
			int a=nums[i];
			for (int j =0; j < n; j++) {
			 int  b=nums[j];
			 for (int k = 0; k < nums.length; k++) {
				int c=nums[k];
				for (int l =0; l < nums.length; l++) {
					int d=nums[l];
					 String ab=a+""+b;
					 String cd=c+""+d;
					 if(ab.equals(cd) && a != b && a != c & a != d && 
								b != c && b != d && c != d){
						 System.out.printf("%d|%d==%d|%d",a,b,c,d);
						 System.out.println();
						 matched=false;
					 }
				}
			}
			}
		}
		if(matched){
			System.out.println("No");
		}
		
		
		

	}

}
