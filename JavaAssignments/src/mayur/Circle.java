package mayur;

public class Circle {
	static float radious;

	// created constructor to initialize value
	Circle() {
		radious = 10.0f;
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
