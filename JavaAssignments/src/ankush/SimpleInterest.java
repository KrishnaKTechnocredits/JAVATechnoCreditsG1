package ankush;

public class SimpleInterest {

	static void simpleInterestCal(float principle, float time, float rate) {
		System.out.println("Simple Interest Calculation : " + ((principle * time * rate) / 100));
	}

	public static void main(String[] args) {
		float principle = Float.parseFloat(args[0]);
		float time = Float.parseFloat(args[1]);
		float rate = Float.parseFloat(args[2]);
		SimpleInterest.simpleInterestCal(principle, time, rate);

	}
}
