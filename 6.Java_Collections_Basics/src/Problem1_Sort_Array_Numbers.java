import java.util.Arrays;
import java.util.Scanner;

public class Problem1_Sort_Array_Numbers {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

	}

}
