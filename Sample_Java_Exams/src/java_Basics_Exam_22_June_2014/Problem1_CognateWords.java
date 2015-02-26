package java_Basics_Exam_22_June_2014;

import java.util.HashSet;
import java.util.Scanner;

public class Problem1_CognateWords {
	public static void main(String[] args) {
HashSet<String> matches=new HashSet<>();
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split("[^a-zA-z]+");
		boolean exsist=true;
		for (int i = 0; i < line.length; i++) {
			 String word = line[i];
			for (int j = 0; j < line.length; j++) {
				String word2 = line[j];
				for (int k = 0; k < line.length; k++) {
				  String word3 = line[k];
				  String word12 = word + word2;
					if (word12.equals(word3) && i != j && j!=k&& k!=i) {
						String match=word+"|"+word2+"="+word3;
						if(!matches.contains(match)){
						matches.add(match);
					     exsist=false;
					
						}
						}
				}
			}

		}
		for (String match : matches) {
			System.out.println(match);
		}
		if(exsist){
			System.out.println("No");
		}
	}
}
