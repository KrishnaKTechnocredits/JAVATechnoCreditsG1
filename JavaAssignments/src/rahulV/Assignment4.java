package rahulV;

public class Assignment4 {

	static void rect(float l, float b) { // method to calculate area and perimeter of rectangle

		float A = l * b;
		float P = 2 * (l + b);
		System.out.println("Area of rectangle: " + A + "\nPerimeter pf rectangle: " + P);
	}

	static void circle(float r) { // method to calculate area and perimeter of circle

		float A = 3.14f * r * r;
		float P = 2 * 3.14f * r;
		System.out.println("Area of circle: " + A + "\nPerimeter pf circle: " + P);
	}

	public static void main(String[] a) {
		float l = Float.parseFloat(a[0]);
		float b = Float.parseFloat(a[1]);
		float r = Float.parseFloat(a[2]);

		rect(l, b);
		circle(r);
	}

}
