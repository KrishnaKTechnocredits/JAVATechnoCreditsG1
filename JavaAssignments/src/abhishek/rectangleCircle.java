package abhishek;

public class rectangleCircle {

	static double pai = 3.14;
	
	static void areaAndprimeterCircle(int r) {

		System.out.println("area of circle is " + pai * (r * r) + " and perimeter of circle is " + (2 * pai * r));

	}

	static void areaAndprimeterRectangle(int l, int w) {

		System.out.println("arear of the rectangle is " + l * w + " and perimeter of the rectangle is " + 2 * (l + w));

	}

	public static void main(String[] args) {
		areaAndprimeterCircle(8);
		areaAndprimeterRectangle(10, 5);

	}
}
