package saket;

public class Circle {

	float radius;

	float getrad() {

		radius = 5.0f;
		
		return radius;
	}

	double carea(float π)
	{
		
		float radius = getrad();

		float Area= π  * radius * radius;
		
		//System.out.println(Area);

		return Area;

	}

	double ccircumference(float π) {
		
		float radius = getrad();
       float circumference = 2 * radius * π;
		//System.out.println(circumference);
		return circumference;
	

	}

}
