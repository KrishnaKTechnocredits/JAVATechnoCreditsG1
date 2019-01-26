package abhishek;

public class TimeConverter {
	static void TimeConverter(int sec) {

		double mint = sec / 60;
		double hour = mint / 60;
		System.out.println("Time in minute " + mint + "m && Time in hour " + hour + "h");
	}

	public static void main(String[] args) {
		TimeConverter(240);
	}
}