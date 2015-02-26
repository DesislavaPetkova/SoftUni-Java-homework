package java_Basics_Exam_1_June_2014;

import java.math.BigDecimal;
import java.util.Scanner;

public class Problem3_Simple_Expression {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		String line=scan.nextLine().replace(" ", "");
		String[] numbers=line.split("[^0-9.]+");
		String[] operations=line.split("[0-9.]+");
		BigDecimal sum=new BigDecimal(numbers[0]);
		
		
		for (int i = 1; i < operations.length; i++) {
			BigDecimal num=new BigDecimal(numbers[i]);
			if(operations[i].equals("+")){
				sum=sum.add(num);
			}
			if(operations[i].equals("-")){
				sum=sum.subtract(num);
			}
			
		}
		System.out.println(sum);
		
		
		
	}

}
