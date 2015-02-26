import java.util.Scanner;

public class Problem1_Symmetric_Numbers_Range {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a >= 0 && b <= 999) {
			for (int i = a; i <= b; i++) {

				isSymetric(i, a, b);
			}
		}
	}

	public static void isSymetric(int i, int a, int b) {
		while (i <= 9) {
			System.out.printf("%d ", i);
			break;
		}
		if (i > 9 && i <= 99) {
			Integer firstNumber = i / 10;
			Integer secondNumber = i % 10;
			if (firstNumber.equals(secondNumber)) {
				System.out.printf("%d ", i);

			}

		} else {
			Integer firstNumber1 = i / 100;
			Integer thirdNumber = i % 10;
			if (firstNumber1.equals(thirdNumber)) {
				System.out.printf("%d ", i);
			}

		}
	}
}
