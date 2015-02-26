import java.util.Scanner;


public class Problem5_Decimal_to_Hexadecimal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		String hex=Integer.toHexString(num);
		System.out.println(hex);
	}

}
