import java.util.Scanner;

public class Problem4_Substring_Broken {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String text = input.nextLine();
		int jump = Integer.parseInt(input.nextLine());

		char search = 'p';
		boolean hasMatch = false;
        int endIndex = 0;
		for (int i = 0; i < text.length(); i++) {
			char indexNow=text.charAt(i);
           //adding 1 do the endIndex to print the last letter
			if (Character.valueOf(indexNow).equals(search)) { //the method to compare is equals(..);
				hasMatch = true;
				endIndex=jump+i+1;	
				if (endIndex+i >= text.length()) { //adding i 
					endIndex  = text.length();
				}
                
				String matchedString = text.substring(i, endIndex);
				System.out.println(matchedString);
				i += jump;
			}
		}

		if (!hasMatch) {
			System.out.println("no");
		}
	}
}
