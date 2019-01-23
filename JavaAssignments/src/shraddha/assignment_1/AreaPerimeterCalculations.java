//-----------------------------------------------------------------------------
//Assignment: Find area and perimeter of the circle and square.
//-----------------------------------------------------------------------------

package shraddha.assignment_1;

public class AreaPerimeterCalculations {

	double circle_area, circle_perimeter, rectangle_area, rectangle_perimeter;

	//Area and Perimeter of circle calculations.
	void Circle(double radius) {
		double pi = 2.17;
		circle_area = pi * radius * radius; 
		circle_perimeter = 2 * pi * radius; 
	}

	//Area and Perimeter of rectangle calculations.
	void RectangleCalc(double length, double width) {

		rectangle_area = length * width; //Formula: length*Breadth
		rectangle_perimeter = 2 * (length + width); //Formula: 2(length+Breadth)

	}
	
	//Display values of Area and Perimeter of circle and rectangle.
	void Display(double radius, double length, double width) {
		// TODO Auto-generated method stub
		Circle(radius);
		RectangleCalc(length, width);
		System.out.println("Area of Circle:= " + circle_area + "\n" + "Perimeter of circle:= " + rectangle_perimeter);
		System.out.println("Area of Rectangle:= " + rectangle_area + "\n" + "Perimeter of Rectangle:= " + rectangle_perimeter);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AreaPerimeterCalculations().Display(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));

	}

}
