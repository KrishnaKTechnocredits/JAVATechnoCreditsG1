package shwetaR;

public class ShwetaR_Assignment_Q4 {

	static void areaOfRectangle(int length, int width){
		int area = length*width;
		System.out.println(area);
	}
	static void areaOfCircle(double radius){
		double area = 3.14*radius*radius;
		System.out.println(area);
	}
	
	static void perimeterOfRectangle(int length, int width)
	{
		int perimeter = 2*(length+width);
		System.out.println(perimeter);
	}
	static void perimeterOfCircle(int radius)
	{
		double perimeter = 2*3.14*radius;
		System.out.println(perimeter);
	}
	
	public static void main(String[] args) {
		int l = Integer.parseInt(args[0]);
		int w = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		areaOfCircle(r);
		areaOfRectangle(l, w);
		perimeterOfCircle(r);
		perimeterOfRectangle(l, w);
	}
}
