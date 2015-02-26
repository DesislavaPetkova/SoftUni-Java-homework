import java.util.Scanner;


public class Problem1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int mood=scan.nextInt();
		scan.nextLine();
		String[] line=scan.nextLine().split("[^a-zA-Z0-9]");
         for (int i = 0; i < line.length; i++) {
			if(line[i].equals("")){
				continue;
			}
			else{
				if(line[i].equalsIgnoreCase("Cram")){
					mood+=2;
				}
				else if(line[i].equalsIgnoreCase("Lembas")){
					mood+=3;
				}
				else if(line[i].equalsIgnoreCase("Apple")){
					mood+=1;
				}
				else if(line[i].equalsIgnoreCase("Melon")){
					mood+=1;
				}
				else if(line[i].equalsIgnoreCase("HoneyCake")){
					mood+=5;
				}
				else if(line[i].equalsIgnoreCase("Mushrooms")){
					mood-=10;
				}
				else{
				mood-=1;
				}
				
			}
		}
         
         if(mood<-5){
        	 System.out.println(mood);
        	 System.out.println("Angry");
         }
         else if(mood>=-5 &&mood<0){
        	 System.out.println(mood);
        	 System.out.println("Sad");
         }
         else if(mood>=0 && mood<15){
        	 System.out.println(mood);
        	 System.out.println("Happy");
         }else
         {
        	 System.out.println(mood);
         System.out.println("Special JavaScript mood");
         }
		
		
	}

}
