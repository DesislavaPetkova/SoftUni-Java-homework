import java.util.Scanner;


public class Problem6_SumTwoNumbers {

public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int num2=in.nextInt();
		
		int sum=num+num2;
		System.out.println(sum);
		
		in.close();
	}
}
