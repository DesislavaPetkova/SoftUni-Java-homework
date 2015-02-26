import java.util.Scanner;


public class Problem7_Count_Bits_One {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int i=Integer.bitCount(num);  //calculate the count of bits - 1
		System.out.println(i);	

	}

}
