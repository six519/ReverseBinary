import java.util.*;
import java.lang.*;

class ReversedBinaryToDecimal {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int decimalNumber;

		try {

			decimalNumber = scanner.nextInt();

			if(decimalNumber >= 1 && decimalNumber <= 1000000000) {

				System.out.println(Integer.parseInt(new StringBuilder(Integer.toBinaryString(decimalNumber)).reverse().toString(),2));

			} else {
				throw new InputMismatchException();
			}

		}catch(InputMismatchException e) {
			System.out.println("Invalid input");
		}

	}

}
