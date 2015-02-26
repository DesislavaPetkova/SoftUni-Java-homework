package java_Basics_Exam_26_May_2014;

import java.util.Scanner;

public class Problem1_Video_Durations {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int hours=0;
		int minutes=0;
		String[] line=scan.nextLine().split(":");
		while(!(line[0].equals("End"))){
			hours+=Integer.parseInt(line[0]);
			minutes+=Integer.parseInt(line[1]);
			line=scan.nextLine().split(":");
		}
		while(minutes>=60){
			hours++;
			minutes-=60;
		}
		if(minutes<10){
		System.out.printf("%d:0%d",hours,minutes);
		}
		else{
			System.out.printf("%d:%d",hours,minutes);
		}
		
	}

}
