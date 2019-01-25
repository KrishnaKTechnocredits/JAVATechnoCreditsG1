package vishal;

public class SimpleInterest {
	public float simpleInterest(float amt, float year, float rate) {
		float simpleInterest = (amt * year * rate) / 100;
		return simpleInterest;
	}

	public static void main(String[] args) {
		SimpleInterest si = new SimpleInterest();
		int enterAmt = Integer.parseInt(args[0]);
		int enterYear = Integer.parseInt(args[1]);
		float enterRate = Float.parseFloat(args[2]);

		float simpleInt = si.simpleInterest(enterAmt, enterYear, enterRate);
		System.out.println("Simple Interest is " + simpleInt);

	}
}
