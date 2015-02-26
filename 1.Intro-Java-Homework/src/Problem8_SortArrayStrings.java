import java.util.Scanner;


public class Problem8_SortArrayStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		String arrayName[] = new String[num + 1];
		for (int i = 0; i < num + 1; i++) {
			arrayName[i] = scan.nextLine();
		}
		scan.close();
		for (int a = 0; a < arrayName.length ;a++) {

			for (int j = a+1; j < arrayName.length ; j++) {
				if (arrayName[a].compareTo(arrayName[j]) > 0) {
					String temp = arrayName[a];
					arrayName[a] = arrayName[j];
					arrayName[j] = temp;
				}

			}
		}

		for (int k = 0; k < num + 1; k++) {
			System.out.println(arrayName[k]);
		}
	}
}
