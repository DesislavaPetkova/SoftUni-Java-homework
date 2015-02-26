import java.util.Scanner;

public final class Problem5_Angle_Unit_Converter {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < num; i++) {
			String[] line1 = scan.nextLine().trim().split("\\s+");

			if (line1[1].equals("deg")) {
				degToRad(line1[0]);

			} else {
				radToDeg(line1[0]);
			}

		}

	}

	public static void degToRad(String line1) {

		double degg = Double.parseDouble(line1);
		double rad = Math.toRadians(degg);
		System.out.printf("%.6f\n", rad);
	}

	public static void radToDeg(String line1) {

		double rad = Double.parseDouble(line1);
		double deg = Math.toDegrees(rad);
		System.out.printf("%.6f\n", deg);

	}

}
