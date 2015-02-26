package java_Basics_Exam_3_September_2014;

import java.util.Scanner;

public class Problem1_Dozen_Eggs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String[] numAndStr;
		int dozens=0;
		int eggs=0;
		for (int i = 0; i < 7; i++) {
			numAndStr=scan.nextLine().split(" ");
			if(numAndStr[1].equals("dozens")){
				dozens+=Integer.parseInt(numAndStr[0]);
			}
			else{
				eggs+=Integer.parseInt(numAndStr[0]);
			}
				
		}
		while(eggs>=12){
			dozens++;
			eggs-=12;
		}
		System.out.printf("%d dozens + %d eggs",dozens,eggs);

		
		
	}

}
