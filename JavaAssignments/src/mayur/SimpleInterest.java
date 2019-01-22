package mayur;

public class SimpleInterest 
{
	static float interest;

	public static void main(String[] args) 
	{
		float P = (float) Double.parseDouble(args[0]);
		float T = (float) Double.parseDouble(args[1]);
		float R = (float) Double.parseDouble(args[2]);
		SimpleInterest c = new SimpleInterest();
		c.calculate(P, T, R);
		c.displayInterest(P, T, R);
	}

	float calculate(double P, double T, double R) 
	{
		return interest = (float) ((P * T * R) / 100);//formula to calculate simple interest
	}

	void displayInterest(double P, double T, double R) 
	{
		System.out.println("Interest on " + P + " for duration " + T + "year(s)" + " where rate of interest is " + R
				+ " = " + interest);
	}
}
