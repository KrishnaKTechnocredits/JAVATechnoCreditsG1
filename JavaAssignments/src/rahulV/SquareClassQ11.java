package rahulV;

import java.util.Scanner;

public class SquareClassQ11 {

	double side;
	
	SquareClassQ11(double side){    //parameterized constructor
		this.side = side;
	}
	
	void area() {                  //method to calculate area of square
		double area = side *side;
		System.out.println("Area of square is "+area);
	}
	
	
	}


