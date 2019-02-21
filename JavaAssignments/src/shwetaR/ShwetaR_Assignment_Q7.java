package shwetaR;

public class ShwetaR_Assignment_Q7 {
	float seconds;

	static void minutes(float seconds) {
		float min = seconds / 60;
		System.out.println(min);
	}

	static void hours(float seconds) {
		float hour = seconds / 3600;
		System.out.println(hour);
	}

	static void miniSeconds(float seconds) {
		float miniSec = seconds * 60;
		System.out.println(miniSec);
	}

	public static void main(String[] args) {
		float seconds = Float.parseFloat(args[0]);
		minutes(seconds);
		hours(seconds);
		miniSeconds(seconds);
	}
}
