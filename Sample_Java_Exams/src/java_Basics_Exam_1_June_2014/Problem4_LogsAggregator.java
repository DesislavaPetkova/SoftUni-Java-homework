package java_Basics_Exam_1_June_2014;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import sun.reflect.generics.tree.Tree;

public class Problem4_LogsAggregator {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int n=Integer.parseInt(scan.nextLine());
		 TreeMap<String, TreeMap<String, Integer>> users=new TreeMap<>(); 	
		 
		 for (int i = 0; i <n; i++) {
			String[] input=scan.nextLine().split(" "); 
		
			String ip=input[0];
			String user=input[1];
			int minutes=Integer.parseInt(input[2]);
			 
			if(!users.containsKey(user)){
				users.put(user, new TreeMap<String,Integer>());  
			}
			  TreeMap<String,Integer> sessions=users.get(user);
			  int newminutes=0;
			  if(sessions.containsKey(ip)){
				  newminutes=sessions.get(ip);
			  }
			  sessions.put(user, newminutes+minutes);
		}
		
		
		
			
		}
		
		
	}


