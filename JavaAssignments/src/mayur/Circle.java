package mayur;

public class Circle {
	private static float radious;

	// created constructor to initialize value
	public Circle(float radious2) {
		radious = radious2;
	}

	void areaCircle() {
		float areaCircle = (float) (3.14 * radious * radious);// formula to calculate area of circle
		System.out.println("Area of circle is " + areaCircle);
	}

	void CircumferenceCircle() {
		float Circumference = (float) (2 * 3.14 * radious);
		// formula to calculate Circumference of circle
		System.out.println("Circumference of circle is " + Circumference);
	}

}
