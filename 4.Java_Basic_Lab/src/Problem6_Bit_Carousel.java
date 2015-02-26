import java.util.Scanner;

public class Problem6_Bit_Carousel {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		byte number = Byte.parseByte(input.nextLine());
		int rotations = Integer.parseInt(input.nextLine());

		
			for (int i = 0; i < rotations; i++) {
				String direction = input.nextLine();

				if (direction.equals("right")) { /*changed to compare the values not the adresses*///change byte to int
					int rightMostBit = number & 1;
					number >>= 1;
					number |= (rightMostBit << 5);
				} else if (direction.equals("left")) {
					int leftMostBit = (number>>5)&1;
					number <<= 1;
					 /*the seventh bit must remain 0 as it outside of the table*/
					number &=~(1<<6);
					number|=leftMostBit;
				}

			}
			System.out.println(number);
		}
	}

