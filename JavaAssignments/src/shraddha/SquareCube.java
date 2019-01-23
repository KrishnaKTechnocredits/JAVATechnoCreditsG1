//-----------------------------------------------------------------------------
//Assignment: Find square and cubes of the user provided number.
//-----------------------------------------------------------------------------

package shraddha;

public class SquareCube {

	// SQUARE FUNCTION
	int SquareFunction(int number) {
		int square_result = number * number;
		return square_result;
	}

	// CUBE FUNCTION
	int CubeFunction(int number) {
		int cube_result = number * number * number;
		return cube_result;
	}

	// DISPLAY SQUARE AND CUBE RESULTS
	void display(int number) {
		System.out.println("Square of number" + " " + number + " is:" + SquareFunction(number));
		System.out.println("Cube of number" + " " + number + " is:" + CubeFunction(number));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new SquareCube().display(Integer.parseInt(args[0]));

	}

}
