import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem10_Extract_All_Unique_Words {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().toLowerCase().split("\\W+"); // removing the each non-letter
		Arrays.sort(line);                                           //Sorting the string
		ArrayList<String> sorted = new ArrayList<>();            
		for (int i = 0; i < line.length; i++) {                  
			sorted.add(line[i]);                               //adding the sorted strings into the ArrayList
		}
		for (int i = 0; i < sorted.size(); i++) {
			for (int j = i + 1; j < sorted.size(); j++) {      // checking if it have repeating words 
				String str = sorted.get(i);
				String str2 = sorted.get(j);
				if (str.equals(str2)) {
					sorted.remove(str2);                      //and removing them
				}
			}
		}

		for (int i = 0; i < sorted.size(); i++) {              //printing the ArrayList
			System.out.printf("%s ", sorted.get(i));
		}
	}
}
