package shwetaR;

public class ShwetaR_Assignment_Q5 {

	static void simpleInterest(int principle, double time, float rate) {
		double I = (principle * time * rate) / 100;
		System.out.println(I);
	}

	public static void main(String[] args) {
		int p = Integer.parseInt(args[0]);
		double t = Double.parseDouble(args[1]);
		float r = Float.parseFloat(args[2]);
		simpleInterest(p, t, r);

	}
}
