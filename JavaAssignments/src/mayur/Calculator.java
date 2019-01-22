package mayur;

public class Calculator
{
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		System.out.println("Numbers Enter by user are : " + args[0] + "," + args[1]);
		System.out.println("Addition is  " + c.addition(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
		System.out.println("Substraction is  " + c.substraction(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
		System.out.println("multiplication is  " + c.multiplication(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
		System.out.println("division is  " + c.division(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
	}
	public double addition(double value1, double value2) 
	{
		return value1 + value2;
	}

	public double substraction(double value1, double value2) 
	{
		return value1 - value2;
	}

	public double multiplication(double value1, double value2) 
	{
		return value1 * value2;
	}

	public double division(double value1, double value2) 
	{
		return value1 / value2;
	}
}
