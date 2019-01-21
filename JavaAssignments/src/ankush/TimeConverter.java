package ankush;

public class TimeConverter {

	// Method to convert Seconds into Hours, Minutes and Seconds
	static void timeconv(int seconds) {
		int sec = seconds % 60;
		int min = (seconds / 60) % 60;
		int hours = (seconds / 3600);
		System.out.println(hours + ":" + min + ":" + sec);
	}

	public static void main(String[] args) {
		int seconds = Integer.parseInt(args[0]);
		TimeConverter.timeconv(seconds);
	}
}
