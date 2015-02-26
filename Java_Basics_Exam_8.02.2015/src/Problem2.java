import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		ArrayList<Double> finalSum=new ArrayList<>();
		for (int j = 0; j < line.length; j++) {
			String[] num = line[j].split("\\D+");
			String[] letters = line[j].split("\\d+");
		
			for (int i = 0; i < num.length; i++) {
				if (num[i].equals("")) {
					continue;
				}
				Double number = Double.parseDouble(num[i]);
				
				for (int k = 0; k < letters.length-1; k++) {
					boolean fupper = !letters[0].equals(letters[0].toLowerCase());
					boolean flower = !letters[0].equals(letters[0].toUpperCase());
					boolean supper = !letters[1].equals(letters[1].toLowerCase());
					boolean slower = !letters[1].equals(letters[1].toUpperCase());
					if (fupper) {
						char[] elemrnt1=letters[k].toCharArray();
						double elementA = (double) elemrnt1[0];
						double letA =elementA - 64;
						number/=letA;
						
					}
					if(flower){
						char[] elemrnt1=letters[k].toCharArray();
						double elementB = (double) elemrnt1[0];
						double letB = elementB-96;
						number*=letB;
					}
					
					if (slower) {
						char[] elemrnt1=letters[k+1].toCharArray();
						double elementA = (double) elemrnt1[0];
						double letA =elementA - 96;
						number+=letA;
						
					}
					if(supper){
						char[] elemrnt1=letters[k+1].toCharArray();
						double elementB = (double) elemrnt1[0];
						 double letB = elementB-64;
						number-=letB;
					}
					finalSum.add(number);
				}
				
			}
		}
		double sum=0.0;
		for (int i=0;i<finalSum.size();i++){
		 sum+=finalSum.get(i);
		}
		System.out.printf("%.2f",sum);

	}

}
