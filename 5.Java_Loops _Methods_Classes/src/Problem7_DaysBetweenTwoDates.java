//if you want to try this tack you have to download the libraries from here
// http://sourceforge.net/projects/joda-time/files/joda-time/2.1/
//I can`t upload them, because they are above 2MB.

import java.util.Scanner;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class Problem7_DaysBetweenTwoDates {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String startDate = input.nextLine();
		String endDate = input.nextLine();
		String[] firstDateSplitted = startDate.split("-");
		String[] secondDateSplitted = endDate.split("-");
		DateTime past = new DateTime(Integer.parseInt(firstDateSplitted[2]),
				Integer.parseInt(firstDateSplitted[1]),
				Integer.parseInt(firstDateSplitted[0]), 0, 0);
		DateTime today = new DateTime(Integer.parseInt(secondDateSplitted[2]),
				Integer.parseInt(secondDateSplitted[1]),
				Integer.parseInt(secondDateSplitted[0]), 0, 0);
		int days = Days.daysBetween(past, today).getDays();
		System.out.println(days);
	}

}
