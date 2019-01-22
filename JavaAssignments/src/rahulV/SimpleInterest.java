package rahulV;

public class SimpleInterest {

	// method to calculate simple interest (passing int value for principal amount)

	void interest(int P, double T, double R) {
		double interest = (P * R * T) / 100;

		System.out.println("Simple interest is: " + interest);
	}

	public static void main(String[] args) {
		SimpleInterest i = new SimpleInterest();

		i.interest(12534, 2.5, 7.5);

	}

}
