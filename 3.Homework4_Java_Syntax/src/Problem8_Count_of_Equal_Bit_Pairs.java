import java.util.Scanner;

public class Problem8_Count_of_Equal_Bit_Pairs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		String numBinary = Integer.toBinaryString(num);
		char[] numArray = numBinary.toCharArray();
		for (int i = 1; i < numArray.length ; i++) {
			if (numArray[i - 1] == numArray[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
 