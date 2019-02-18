package saket;

public class Areaoverloading {

	public static void main(String[] args) {

		Area(6,3);

	}

	static void Area(int side)

	{
		double areaofsquare = (side * side);
		System.out.println("areaofsquare is " + areaofsquare);
	}

	static void Area(int length, int breath) {

		int Areaofrectangle = length * breath;
		System.out.println("Areaofrectangle is " + Areaofrectangle);

	}

	static void Area(int rad, double pie)

	{

		double areofcircle = pie * rad * rad;
		System.out.println("areofcircle is " + areofcircle);

	}
}