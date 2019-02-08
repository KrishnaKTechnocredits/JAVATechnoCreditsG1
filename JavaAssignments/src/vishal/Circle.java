package vishal;

public class Circle {
	float radius = 0.0f;
	final float Pi = 3.14f;

	public void setRadius(float radius) {
		if (radius > 0) {
			this.radius = radius;
		}

	}

	public void areaCircle() {
		float areaCir = Pi * radius * radius;
		System.out.println("Area of circle is " + areaCir);
	}

	public void circumferenceCircle() {
		float circumCircle = 2 * Pi * radius;
		System.out.println("Circumference of circle is " + circumCircle);
	}

}
