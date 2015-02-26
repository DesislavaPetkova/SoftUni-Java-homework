import java.util.Scanner;


public class Problem5_Count_All_Words {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String[] words=scan.nextLine().split("\\W+"); //reading the next lines ("\\W+")split on non-letter character
		int size=words.length; 
		System.out.println(size);
	
	}

}
