package vishal;

public class SquareCube {
	public int square(int num) {
		int result = num * num;
		return result;
	}

	public int cube(int num) {
		int result = num * num * num;
		return result;
	}

	public static void main(String[] args) {
		SquareCube sc = new SquareCube();
		int square = sc.square(5);
		int cube = sc.cube(5);

		System.out.println("Square of a num is " + square);
		System.out.println("Cube of a num is " + cube);
	}
}
