package vishal;

public class ConvertTemp {
	public float convertTemp(float fahTemp) {
		float cel = (fahTemp - 32) * 5 / 9;
		return cel;
	}

	public static void main(String[] args) {
		ConvertTemp ct = new ConvertTemp();
		int enterTemp=Integer.parseInt(args[0]);
		float convertedTemp = ct.convertTemp(enterTemp);
		System.out.println("Converted Tempture in Celsius is " + convertedTemp);

	}
}