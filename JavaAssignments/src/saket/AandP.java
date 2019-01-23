package saket;

public class AandP {

	static float r = 2.5f;
	static int length = 100;
	static int breath = 200;
	static int width = 300;
	int Areaofrectangle;
	int Perimeterofrectangle;
	int Areaofcircle;
	int Perimeterofcircle;
	static double x;
	static double y;
	static double z;
	static double u;

	static void Areaofcircle() {

		x = 3.14 * r * r;
		System.out.println("Area of circle is " + x);
	}

	static void Perimeterofcircle() {

		y = 2 * 3.14 * r;
		System.out.println("Perimeterofcircle  " + y);
	}

	static void Areaofrectangle() {

		z = length * breath;
		System.out.println("Area of rectangle " + z);
	}

	static void Perimeterofrectangle() {

		u = 2 * (length * width);
		System.out.println("Perimete of rectangle " + u);
	}

	public static void main(String[] args) {

		Areaofrectangle();
		Perimeterofcircle();
		Perimeterofrectangle();
		Areaofcircle();

	}

}
