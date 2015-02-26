import java.util.Locale;
import java.util.Scanner;


public class Problem6_Formatting_Numbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
			
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		float b=scan.nextFloat();
		float c=scan.nextFloat();
		if(a>=0 && a<=500){
		String aHex=Integer.toHexString(a);
		String aBinary=String.format("%10s",Integer.toBinaryString(a)).replace(' ','0');
		
		System.out.printf("|%-10s|",aHex);
		System.out.printf("%10s|",aBinary);
		System.out.printf("%10.2f|",b);
		System.out.printf("%-10.3f|",c);
		}
		
	}

}
