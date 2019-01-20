package rahulV;

public class SquareAndCube {
	

	int square(int num) {  //method for square of number

		return num * num;
	}
	
	int cube(int num) {    //method for cube of number

		return num*num*num;
	}


	public static void main(String[] args) {
		SquareAndCube s1 = new SquareAndCube();    
		System.out.println(s1.square(5));  //25
		System.out.println(s1.cube(8));    //512

	}

}
