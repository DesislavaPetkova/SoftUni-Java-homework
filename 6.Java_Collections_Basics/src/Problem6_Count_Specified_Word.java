import java.util.Scanner;


public class Problem6_Count_Specified_Word {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine().toLowerCase();
		String[] words=word.split("\\W+");	
		String nextWord=scan.nextLine();
		int counter=0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(nextWord)){
				counter++;
			}
		}
		System.out.println(counter);
	}

}
