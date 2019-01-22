package mayur;

public class FahrenheitToCelsius 
{
	static int Celsius;

	public static void main(String[] args) 
	{
		FahrenheitToCelsius f = new FahrenheitToCelsius();
		float fahrenheit = (float) (Double.parseDouble(args[0]));
		f.convertToCelsius(fahrenheit);
		f.printResult(fahrenheit);
	}

	void convertToCelsius(float fahrenheit) 
	{
		Celsius = (int) ((fahrenheit - 32) * 5 / 9);// formula
	}

	void printResult(float fahrenheit) 
	{
		System.out.println(+fahrenheit + " fahrenheit = " + Celsius + " Celsius");
	}

}
