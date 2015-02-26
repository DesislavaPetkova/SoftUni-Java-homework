package javaBasics_Exam_21_09_2014_Morning;

import java.util.Scanner;


public class Problem1_Timespan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] time1 = scan.nextLine().split(":");
		long secondsTime1 = Long.parseLong(time1[2])
				+ (Long.parseLong(time1[1]) * 60)
				+ (Long.parseLong((time1[0])) * 3600);
		String[] time2 = scan.nextLine().split(":");
		long secondstime2 = Long.parseLong(time2[2])
				+ (Long.parseLong(time2[1]) * 60)
				+ (Long.parseLong((time2[0])) * 3600);

		long timeBetween = secondsTime1 - secondstime2;
		long seconds = (int) (timeBetween % 60);
		long minutes = (int) (timeBetween % 3600) / 60;
		long hours = (int) (timeBetween / 3600);

		if (minutes < 10 && seconds >= 10) {
			System.out.printf("%d:0%d:%d", hours, minutes, seconds);
		}

		else if (seconds < 10 && minutes >= 10) {
			System.out.printf("%d:%d:0%d", hours, minutes, seconds);
		} else if (seconds < 10 && minutes < 10) {
			System.out.printf("%d:0%d:0%d", hours, minutes, seconds);
		}
		else{
			System.out.printf
			("%d:%d:%d", hours, minutes, seconds);
		}
	}
}
