package ankush;

public class TemperatureConverter {
	
	static void temperature(float temperature)
	{
		System.out.println(temperature+" Temperature Converted from Fahrenheit to Celsius : " +((temperature-32)*5)/9);
	}
	
	public static void main(String[] args) {
	float temperature=Float.parseFloat(args[0]);
	TemperatureConverter.temperature(temperature);
}
}
