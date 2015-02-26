import java.util.Scanner;

public class Problem8_Extract_Emails {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" "); // splitting the separate
													// words

		for (int i = 0; i < line.length; i++) {
			// searching for matches with regex
			if (line[i]
					.matches("([_A-Za-z0-9-]+)(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})")) {

				System.out.println(line[i]);
			}
		}
	}
}
