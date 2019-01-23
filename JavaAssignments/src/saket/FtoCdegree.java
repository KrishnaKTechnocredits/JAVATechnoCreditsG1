package saket;

public class FtoCdegree {
	int Fahrenheit = 20;
	int celcius;

	void formula() {

		celcius = (Fahrenheit - 32) * 5 / 9;
		System.out.println("Conversion of Fahrenheit " + Fahrenheit + "into Celcius is" + celcius);

	}

	public static void main(String[] args) {

		FtoCdegree A = new FtoCdegree();

		A.formula();

	}

}
