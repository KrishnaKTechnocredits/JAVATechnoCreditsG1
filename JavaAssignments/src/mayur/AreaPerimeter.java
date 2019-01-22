package mayur;

public class AreaPerimeter {
	public static void main(String[] args) {
		AreaPerimeter a = new AreaPerimeter();
		float width = (float) Double.parseDouble(args[0]);
		float hight = (float) Double.parseDouble(args[1]);
		a.PerimeterRectangle(width, hight);
		a.AreaRectangle(width, hight);
		float radius = (float) Double.parseDouble(args[2]);
		a.AreaCircle(radius);
		a.CircumferenceCircle(radius);
	}

	void PerimeterRectangle(double w, double h) {
		double perimeterRectangle = 2 * (w + h); // formula to calculate perimeter
		System.out.println("Perimeter of Rectangle is " + perimeterRectangle);

	}

	void AreaRectangle(double w, double h) {
		double areaRectangle = w * h;
		System.out.println("Area of Rectangle is " + areaRectangle);

	}

	void CircumferenceCircle(double r) {
		double Circumference = 2 * 3.14* r;
		System.out.println("Circumference of circle is " + Circumference);

	}

	void AreaCircle(double r) {
		double areaCircle = 3.14 * r * r;// formula to calculate area of circle
		System.out.println("Area of circle is " + areaCircle);

	}

}
