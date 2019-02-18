package saket;

public class Square {

	int side;
	double Area;

	Square(int sidevalue)
	{

		this.side = sidevalue;

	}

	 void Areaofsquare() {

		this.Area = side * side;
		
		System.out.println(Area);
	}

	
}
