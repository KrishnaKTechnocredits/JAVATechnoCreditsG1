package saket;

public class FtoCdegree {

	
	double formula(double Fahrenheit ) {

		double celcius = (Fahrenheit - 32) * 5 / 9;
		
		return celcius;
		
	}

	public static void main(String[] args) {

		FtoCdegree A = new FtoCdegree();

		double convertion=A.formula(25);
		
		System.out.println("Conversion of Fahrenheit "  + "into Celcius is" + convertion);

	}

}
