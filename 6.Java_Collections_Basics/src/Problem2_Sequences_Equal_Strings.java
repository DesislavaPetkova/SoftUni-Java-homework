import java.util.Scanner;

public class Problem2_Sequences_Equal_Strings {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		int len = line.length;
		if (len <= 1) { // checking we have 1 word and printing it

			System.out.println(line[0]);

		} else { // for more than 1
			for (int i = 0; i < len - 1; i++) {
				if (line[i].equals(line[i + 1])) { // checking if the next word is the same
					System.out.printf("%s ", line[i]);
				} else {
					System.out.println(line[i]);
				}
			}
			System.out.println(line[len - 1]); // printing the last word or
												// number,because it`s not the same
												// as the previous one.
		}
	}
}
