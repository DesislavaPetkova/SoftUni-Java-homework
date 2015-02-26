import java.util.Locale;
import java.util.Scanner;

public class Problem9_Points_inside_the_House {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();

		if (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5 || x >= 20
				&& x <= 22.5 && y >= 8.5 && y <= 13.5
				|| insideThriangle(x, y, 12.5, 8.5, 22.5, 8.5, 17.5, 3.5)) {
			System.out.println("Inside");
		} 
		else {
			System.out.println("Outside");
		}

	}

	private static boolean insideThriangle(double x, double y, double x1,
			double y1, double x2, double y2, double x3, double y3) {

		double x_x1 = x - x1;
		double y_y1 = y - y1;

		Boolean s_ab = (x2 - x1) * y_y1 - (y2 - y1) * x_x1 > 0;

		if ((x3 - x1) * y_y1 - (y3 - y1) * x_x1 >= 0 == s_ab)
			return false;

		if ((x3 - x2) * (y - y2) - (y3 - y2) * (x - x2) >= 0 != s_ab)
			return false;

		return true;

	}

}
