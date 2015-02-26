import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem8_Sum_Number_Text_File {

	public static void main(String[] args) {
		File file = new File("input.txt");

		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(file);

			int sum = 0;
			while (scan.hasNextLine()) {
				if (scan.hasNextInt()) {
					sum += scan.nextInt();
				}
			}
			System.out.println(sum);
		}

		catch (FileNotFoundException e) {
			System.out.println("Error");

		}

	}

}
