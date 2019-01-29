package saket;

public class SquareandCube {

	int square(int length) {

		int a = length * length;
		return a;
	}

	int cube(int length) {

		int b = length * length * length;
		return b;

	}

	public static void main(String[] args) {
		SquareandCube A = new SquareandCube();
		int square = A.square(5);
		int cube = A.cube(5);
		System.out.println("Square of the given number is " + square);
		System.out.println("Cube of the given number is " + cube);
	}

}