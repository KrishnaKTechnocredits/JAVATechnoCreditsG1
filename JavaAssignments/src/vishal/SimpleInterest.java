package vishal;

public class SimpleInterest {
	public float simpleInterest(float amt, float year, float rate) {
		float simpleInterest = (amt * year * rate) / 100;
		return simpleInterest;
	}

	public static void main(String[] args) {
		SimpleInterest si = new SimpleInterest();
		float simpleInt = si.simpleInterest(500, 5, 12.5f);
		System.out.println("Simple Interest is " + simpleInt);

	}
}
