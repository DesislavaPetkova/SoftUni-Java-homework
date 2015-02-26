package java_Basics_Exam_27_May_2014;

import java.util.Scanner;

public class Problem1_Count_Beers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		String[] line=scan.nextLine().split(" ");
		int stacks=0;
		int beers=0;
		while(!line[0].equals("End")){
		if(line[1].equals("stacks")){
			stacks+=Integer.parseInt(line[0]);
		}
		else{
			beers+=Integer.parseInt(line[0]);
		}
		line=scan.nextLine().split(" ");
		}
		
		while(beers>=20){
			stacks++;
			beers-=20;
		}
		System.out.printf("%d stacks + %d beers",stacks,beers);
	}

}
