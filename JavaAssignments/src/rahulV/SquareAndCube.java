package rahulV;

public class SquareAndCube {
	

	int square(int num) {  //method to calculate square of number

		return num * num;  //return square of number
	}
	
	int cube(int num) {    //method to calculate cube of number

		return num*num*num;  //return cube of number
	}


	public static void main(String[] args) {
		SquareAndCube s1 = new SquareAndCube();    
		System.out.println(s1.square(5));  //25
		System.out.println(s1.cube(8));    //512

	}

}
