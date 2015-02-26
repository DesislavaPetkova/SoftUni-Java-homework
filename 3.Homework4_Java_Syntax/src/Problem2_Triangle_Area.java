import java.util.Scanner;


public class Problem2_Triangle_Area {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		Integer x1=scan.nextInt();
		Integer y1=scan.nextInt();
		Integer x2=scan.nextInt();
		Integer y2=scan.nextInt();
		Integer x3=scan.nextInt();
		Integer y3=scan.nextInt();
		
		if(x1.equals(y1) && x2.equals(y2) && x3.equals(y3)){
			System.out.println("0");
		}
		
		else{
			int area= (x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2;
			 if (area<0){
				 System.out.println(area*-1); // the area can`t be negative
			 }
			 else{
				 System.out.println(area);
			 }
		}
	}

}
