package java_Basics_Exam_26_May_2014;

import java.util.Scanner;

public class Problem2_Pythagorean_Numbers {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		int[] nums=new int[n];
		boolean noPythagor=true;
		for (int i = 0; i < nums.length; i++) {
			nums[i]=scan.nextInt();
		}
		for (int i = 0; i < nums.length; i++) {
			int a=nums[i];
			for (int j = 0; j < nums.length; j++) {
				int b=nums[j];
				if(a>b){
					continue;
				}
				else{
					for (int k = 0; k < nums.length; k++) {
						int c=nums[k];
						if((a*a+b*b)==c*c){
							System.out.printf("%d*%d + %d*%d = %d*%d",a,a,b,b,c,c);
							System.out.println();
							noPythagor=false;
						}
					}
				}
			}
		}
              if(noPythagor){
            	  System.out.println("No");
              }
	}

}
