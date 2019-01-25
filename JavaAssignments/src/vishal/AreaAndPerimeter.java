package vishal;

public class AreaAndPerimeter {
	public int rectangleArea(int length, int width) {
		int result = length * width;
		return result;
	}

	public int rectanglePerimeter(int length, int width) {

		int result = 2 * (length + width);
		return result;
	}

	public float circleArea(float r) {
		float result = 3.14f * (r * r);
		return result;
	}

	public float circlePerimeter(float r) {
		float result = 2 * 3.14f * r;
		return result;
	}

	public static void main(String[] args) {
		AreaAndPerimeter ap = new AreaAndPerimeter();
		int recArea = ap.rectangleArea(5, 4);
		int recPeri = ap.rectanglePerimeter(5, 4);
		float cirArea = ap.circleArea(4);
		float cirPeri = ap.circlePerimeter(2);

		System.out.println("Rectangle Area " + recArea);
		System.out.println("Rectangle Perimeter " + recPeri);
		System.out.println("Circle Area " + cirArea);
		System.out.println("Circle Perimeter " + cirPeri);

	}
}
