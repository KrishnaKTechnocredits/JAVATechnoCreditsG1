package rahulV;

import java.util.Scanner;

public class TestSquareClassQ11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side of square: ");

		SquareClassQ11 square = new SquareClassQ11(scanner.nextDouble());
		square.area();

	}

}
