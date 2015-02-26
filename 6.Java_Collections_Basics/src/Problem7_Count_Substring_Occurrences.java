import java.util.Scanner;

public class Problem7_Count_Substring_Occurrences {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine().toLowerCase();
		String word = scan.nextLine().toLowerCase();
		int counter = 0;
		int lenStr = text.length();
		int lenWord = word.length();
		for (int i = 0; i <= lenStr - lenWord; i++) {   //removing the word.lenght from text.lenght
			if (text.substring(i, lenWord + i).equals(word)) { //searching the substring that matches the word
				counter++;
			}
		}
		System.out.println(counter); 
	}

}
