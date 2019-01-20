package ankush;

public class AreaPerimeter {

	// Method to calculate Area and Perimeter of a Circle
	static void areaPerimeterCircle(float radius) {
		System.out.println("Area of a Circle : " + (3.14 * (radius * radius)));
		System.out.println("Perimeter of a Circle : " + (2 * 3.14 * radius));
	}

	// Method to calculate Area and Perimeter of a Rectangle
	static void areaPerimeterRectangle(float width, float length) {
		System.out.println("Area of a Rectangle : " + (width * length));
		System.out.println("Perimeter of a Rectangle : " + (2 * (width + length)));
	}

	public static void main(String[] args) {
		float radius = Float.parseFloat(args[0]);
		float width = Float.parseFloat(args[1]);
		float length = Float.parseFloat(args[2]);
		AreaPerimeter.areaPerimeterCircle(radius);
		AreaPerimeter.areaPerimeterRectangle(width, length);
	}
}
