package rahulV;

public class Temperature {

	float celsius;
//code changed to pass float value
	void convert(float fahrenheit) { // method to convert fahrenheit into celsius

		celsius = (fahrenheit - 32);
		float var = celsius * 5 / 9;

		System.out.println("Temperature value in celcius is: " + var);

	}

	public static void main(String[] args) {
		Temperature t = new Temperature();
		t.convert(60.5f);

	}

}
