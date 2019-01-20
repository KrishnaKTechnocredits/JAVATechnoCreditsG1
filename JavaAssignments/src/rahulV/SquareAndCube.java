package rahulV;

public class SquareAndCube {
	

	int square(int num) {

		return num * num;
	}
	
	int cube(int num) {

		return num*num*num;
	}


	public static void main(String[] args) {
		SquareAndCube s1 = new SquareAndCube();
		System.out.println(s1.square(5));
		System.out.println(s1.cube(8));

	}

}
