package ankush;

public class SquareCube {
	
	//Method to Calculate Square of a Number
	static void square(int number)
	{
		System.out.println("Square of a given number : "+(number*number));
	}
	
	//Method to Calculate Square of a Number
	static void cube(int number)
	{
		System.out.println("Square of a given number : "+(number*number*number));
	}
	
	public static void main(String[] args) {
	int number=Integer.parseInt(args[0]);
	SquareCube.square(number);
	SquareCube.cube(number);
}
}
