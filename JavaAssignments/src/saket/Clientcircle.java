package saket;

public class Clientcircle extends Circle {

	public static void main(String[] args)

	{
		Circle c = new Circle();

		double carea = c.carea(3.14f);
		double circum = c.ccircumference(3.14f);
		
		display(carea,circum);
	}

	static void display(double carea, double circum) {

		System.out.println("Area of Circle is" + carea);
		System.out.println("circumference of circle is" + circum);
	}
}
