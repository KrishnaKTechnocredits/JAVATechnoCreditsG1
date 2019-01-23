//----------------------------------------------------------------
//Assignment: Write Java program to calculate simple interest.
//----------------------------------------------------------------

package shraddha.assignment_1;

public class SimpleInterestCalculation {
	
	//SIMPLE INTEREST CALCULATIONS
	double SimpleInterest(double principal, double rate, double time)
	{
		double simpleinterest = (principal*rate*time)/100;
		return simpleinterest;
	}
	
	//DISPLAY FOR SIMPLE INTEREST
	void display(double principal, double rate, double time)
	{
		System.out.println("Simple Interest is:= "+SimpleInterest(principal, rate, time));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SimpleInterestCalculation().display(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));

	}

}
