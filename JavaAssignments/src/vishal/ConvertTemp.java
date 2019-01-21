package vishal;

public class ConvertTemp {
	public float convertTemp(float fahTemp) {
		float cel = (fahTemp - 32) * 5 / 9;
		return cel;
	}

	public static void main(String[] args) {
		ConvertTemp ct = new ConvertTemp();
		float convertedTemp = ct.convertTemp(12);
		System.out.println("Converted Tempture in Celsius is " + convertedTemp);

	}
}
