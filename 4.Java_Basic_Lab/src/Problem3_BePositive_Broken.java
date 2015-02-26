import java.util.ArrayList;
import java.util.Scanner;

public class Problem3_BePositive_Broken {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		int countSequences = scn.nextInt();
		scn.nextLine();

		for (int i = 0; i < countSequences; i++) {
			String[] input = scn.nextLine().trim().split("\\s+"); // matches one or many whitespace and split them
			ArrayList<Integer> numbers = new ArrayList<>();

			for (int j = 0; j < input.length; j++) {
				if (!input[j].equals("")) {
					int num = Integer.parseInt(input[j]); //must be input[j] not input[i]
					numbers.add(num);
				}
			}

			boolean found = false;

			for (int j = 0; j < numbers.size(); j++) {
				int currentNum = numbers.get(j);

				if (currentNum >= 0) { //checking the numbers that are '>=' to 0;
					System.out.printf("%d%s", currentNum,
							j == numbers.size() - 1 ? "\n" : " ");
					found = true;
				} else {
					if (j + 1 < numbers.size()) {
						currentNum += numbers.get(j + 1);
					      
						if (currentNum >= 0) {  //checking for '>=0'
							System.out.printf("%d%s", currentNum,
									j+1 == numbers.size() - 1 ? "\n" : " ");
							found = true;
						}
						j++; //skip the used num

					}
				}
			}

			if (!found) {
				System.out.println("(empty)");
			}
		
		}
	}
}