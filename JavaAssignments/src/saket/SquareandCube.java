package saket;

public class SquareandCube {

	int num = 2;
	int square;
	int cube;

	void square() {

		square = num * num;

	}

	void cube() {
		cube = square * num;

	}

	public static void main(String[] args) {
		SquareandCube A = new SquareandCube();
		A.square();
		A.cube();
		System.out.println("Square of the given number is " + A.square);
		System.out.println("Cube of the given number is " + A.cube);
	}

}