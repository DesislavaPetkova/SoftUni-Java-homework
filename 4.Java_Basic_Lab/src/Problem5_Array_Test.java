//I made a lot of changes in this tack,may be there is another way..I invented this one
// i have worked with Debugging

import java.util.Scanner;

public class Problem5_Array_Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);

		int sizeOfArray = scn.nextInt();
		long[] array = new long[sizeOfArray];

		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextLong();
		}

		String command = scn.next();

		while (!command.equals("stop")) { // it must be 'stop' not 'over'
			String line = scn.nextLine().trim();
			int[] params = new int[2];

			if (command.equals("add") || command.equals("subtract")
					|| command.equals("multiply")) {
				String[] stringParams = line.split(" ");
				params[0] = Integer.parseInt(stringParams[0]);
				params[1] = Integer.parseInt(stringParams[1]);

				performAction(array, command, params);

			}
			if (command.equals("rshift")) {
				arrayShiftRight(array);
			}
			if (command.equals("lshift")) {
				arrayShiftLeft(array);

			}
			// performAction(array, command, params); //don`t need to call it
			// twice

			System.out.print('\n');
			printArray(array);

			command = scn.next();
		}
	}

	static void performAction(long[] array, String action, int[] params) {

		int pos = params[0];
		int value = params[1];

		switch (action) {
		case "multiply":
			array[pos - 1] *= value; // 'pos-1' - to start from the '0' position
			break;
		case "add":
			array[pos - 1] += value; // 'pos-1' - to start from the '0' position
			break;
		case "subtract":
			array[pos - 1] -= value; // 'pos-1' - to start from the '0' position
			break;
		// case "lshift":
		// arrayShiftLeft(array);
		// break; //not calling them here
		// case "rshift":
		// arrayShiftRight(array);
		// break;
		}
	}

	private static void arrayShiftRight(long[] array) {
		long temp = array[array.length - 1];
		for (int i = array.length - 1; i > 0; i--) { // i>=0 not i>=1
			array[i] = array[i - 1];
		}
		array[0] = temp;
	}

	private static void arrayShiftLeft(long[] array) {
		long temp = array[0];
		for (int i = 0; i < array.length - 1; i++) { // it must be array.lenght
														// because we have '<'
			array[i] = array[i + 1];

		}
		array[array.length - 1] = temp;

	}

	private static void printArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}
}
