package vishal;

public class ExceptionQ4 {

	public static void main(String[] args) 
	{
		ExceptionQ4 q4=new ExceptionQ4();
		q4.m1();
	}
	
	public void m1()
	{
		m2();
		
	}
	
	public void m2() throws ArithmeticException
	{
		int i=10;
		try
		{
		i=i/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("You can not divide by zero");
		}
	}

}
