package java_Basics_Exam_27_May_2014;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem4_Orders {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		
		LinkedHashMap<String, TreeMap<String, Integer>> products=new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			String[] line=scan.nextLine().split(" ");
			String name=line[0];
			int nums=Integer.parseInt(line[1]);
			String ProdName=line[2];
			
			if(!products.containsKey(ProdName)){
				products.put(ProdName,new TreeMap<String, Integer>());
				products.get(ProdName).put(name, nums);
			}
			else if(!products.get(ProdName).containsKey(name)){
				products.get(ProdName).put(name, nums);
			}
			else{
				int amount=products.get(ProdName).get(name);
				products.get(ProdName).put(name, nums+amount);
			}
			
			
		}
		for (String product : products.keySet()) {
			System.out.printf("%s: ",product);
			System.out.println();
			int counter=1;
			String output=products.get(product).toString().replace("{", "");
			output=output.replace("}", "");
			System.out.println(output);
			
			
		}
		
		
		
		

	}

}
