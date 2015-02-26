import java.util.Scanner;

public class Problem3_Largest_Sequence_Equal_Strings {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		String longSeq = "";
		String word = "";
		int len = line.length;
		int temp = 1;
		int high = 0;
		if (len <= 1) { // checking we have 1 word and if so printing it
			System.out.println(line[0]);
		}
		for (int i = 0; i < len - 1; i++) {
			if (line[i].equals(line[i + 1])) {
				temp++;                  // increment the counter if the words(numbers) are the same
				word = line[i];         // Assignment the word in line[i] to "word"
			}
			if (!line[i].equals(line[i + 1])) { // if they are different the counter is back to "1";
				temp = 1;
				word = line[i];
			}
			if (high < temp) {
				high = temp;
				longSeq = word;
			}
		}
		for (int h = 0; h < high; h++) { // printing the longest sequence
			System.out.printf("%s ", longSeq);
		}
	}
}
