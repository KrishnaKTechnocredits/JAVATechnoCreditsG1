package mayur;

public class FindSquareCube {

	public static void main(String[] args) 
	{
		FindSquareCube s= new FindSquareCube();
		double number=Double.parseDouble(args[0]);
		s.displaySquare(number);
		s.displaycube(number);
	}
	
	public void displaySquare(double s)
	{		
		System.out.println("Square of "+s+" is :"+(s*s));//square is calculated as "number*number"
	}
	public void displaycube(double s)
	{		
		System.out.println("Cube of "+s+" is :"+(s*s*s));//cube is calculated as "number*number*number"
	}
	
}
