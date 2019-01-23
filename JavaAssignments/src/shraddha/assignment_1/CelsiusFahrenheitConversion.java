//-----------------------------------------------------------------------------
//Assignment: Find celsius from provided Fahrenheit.
//-----------------------------------------------------------------------------

package shraddha.assignment_1;

public class CelsiusFahrenheitConversion {

	void celsius_fahrenheit_calc(int fahrenheit) {
		int celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius:=" + celsius + "\n" + "Fahrenheit:=" + fahrenheit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CelsiusFahrenheitConversion().celsius_fahrenheit_calc(Integer.parseInt(args[0]));

	}

}
