package shwetaR;

public class ShwetaR_Assignment_Q6
{

	float celsius;
	float fahrenheit;

	void conversionOfTemperature(float fahrenheit) {
		celsius = ((fahrenheit - 32) * 5) / 100;
		System.out.println(celsius);
	}

	public static void main(String[] args) {
		float fahrenheit = Float.parseFloat(args[0]);
		ShwetaR_Assignment_Q6 temp = new ShwetaR_Assignment_Q6();
		temp.conversionOfTemperature(fahrenheit);
	}
}
