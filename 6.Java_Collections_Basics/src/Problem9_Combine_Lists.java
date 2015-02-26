import java.util.ArrayList;
import java.util.Scanner;

public class Problem9_Combine_Lists {

	public static void main(String[] args) {

		ArrayList<Character> l1 = new ArrayList<>();
		ArrayList<Character> l2 = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line1 = scan.nextLine();
		String line2 = scan.nextLine();

		for (int i = 0; i < line1.length(); i++) { // add to l1 and l2 the characters from line1
			l1.add(line1.charAt(i));
			l2.add(line1.charAt(i));
		}

		for (int k = 0; k < line2.length(); k++) { // checking if l2 contains letter from line2,
			char temp = line2.charAt(k);   // if no  t adding it to l1
			if (!l2.contains(temp)) {
				l1.add(' ');   // adding "space" before adding the letter
				l1.add(temp);   // adding the letter
			}

		}
		for (int i = 0; i < l1.size(); i++) {    // printing l1
			System.out.printf("%c", l1.get(i));
		}
	}

}
