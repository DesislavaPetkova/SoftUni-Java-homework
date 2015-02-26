package java_Basics_Exam_3_September_2014;

import java.util.Scanner;

public class Problem2_Adding_Angles {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		int degree=0;
		String[] line=scan.nextLine().split(" ");
		boolean nodegree=false;
		for (int i = 0; i < line.length-2; i++) {
			for (int j = i+1; j < line.length-1; j++) {
				for (int j2 = j+1; j2 < line.length; j2++) {
					degree=Integer.parseInt(line[i])+Integer.parseInt(line[j])+Integer.parseInt(line[j2]);
				if(degree%360==0){
					System.out.printf("%s + %s + %s = %d degrees",line[i],line[j],line[j2],degree);
					System.out.println();
					degree=0;
					nodegree=true;
				}
				
				}
			}
		}
		if(!nodegree) {
			System.out.println("No");
			
		}

	}

}
