package rahulV;

public class Assignment3_Q16 {

	double area(double l) { // area of square

		return l * l;
	}

	double area(float l, float b) {  // area of rectangle
		return l * b;
	}

	double area(float r) {   // area of circle
		return 3.14f * r * r;
	}

	public static void main(String[] args) {

		Assignment3_Q16 a = new Assignment3_Q16();

		System.out.println("Area of circle: " + a.area(4.2f));
		System.out.println("Area of rectangle: " + a.area(4.5));
		System.out.println("Area of square: " + a.area(5.5));

	}

}
