package amarja;
//Program to find area and Perimeter of Rectangle and Circle
public class AreaPerimeterProg {
	public static void main(String[] args) {
		AreaPerimeterProg a =new AreaPerimeterProg();
		//Arguments to be passed as unit,length and breadth for Rectangle
		//Arguments to be passed as unit,radius for circle
		a.calRectareaperimtr(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		a.calCircareaperimtr(args[3],Float.parseFloat(args[4]));
		}
	void calRectareaperimtr(String unit,int length,int breadth)
	{
		int area;int perimtr;
		area=length*breadth;
		perimtr=2*(length+breadth);
		System.out.println("Length of Rectangle = " + length + unit);
		System.out.println("Breadth of Rectangle = " + breadth+unit );
		System.out.println("Area of Rectangle =" + area + "sq"+unit);
		System.out.println("Perimeter of Rectangle =" + perimtr +unit);
	}
	void calCircareaperimtr(String unit,float radius)
	{
		double area;double perimtr;
		area=3.14*radius*radius;
		perimtr=2*3.14*radius;
		System.out.println("Radius of Circle = " + radius + unit);
		System.out.println("Area of Circle =" + area + "sq"+unit);
		System.out.println("Perimeter of Circle=" + perimtr +unit);	
	}
}

