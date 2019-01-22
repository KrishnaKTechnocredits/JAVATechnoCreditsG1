package farhin;

public class SquareCube {
	
	public static void main(String[] a) {
		double num=Double.parseDouble(a[0]);
		System.out.println(SquareCube.squareCalc(num));
		System.out.println(SquareCube.cubeCalc(num));
		
	}
	
	
	public static double squareCalc(double num1)
	{
		return num1*num1;
	}
	
	public static double cubeCalc(double num1)
	{
		return num1*num1*num1;
	}

}
