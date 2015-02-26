import java.util.Locale;
import java.util.Scanner;

public class Problem4_Smallest_3_Numbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();

		if (a < b && a < c) {
			System.out.println(a);
		}
		else if (b < a && b < c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}
}
