import java.util.Scanner;

public class Problem2_Generate3_Letter_Words {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String letters = scan.next();
		int len = letters.length();
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				for (int j1 = 0; j1 < len; j1++) {
					System.out.printf("%c%c%c ", letters.charAt(i),
							letters.charAt(j), letters.charAt(j1));
				}
			}

		}

	}

}
