package rahulV;

public class TimeConversion {

	static int hours;
	static int minutes;

	void time(int seconds) {

		hours = seconds / 3600;
		int s1 = seconds % 3600;
		minutes = s1 / 60;
		seconds = s1 % 60;
		System.out.println("Hours: " + hours + " Minutes: " + minutes + " Seconds: " + seconds);
	}

	public static void main(String[] a) {

		TimeConversion t = new TimeConversion();
		int seconds = Integer.parseInt(a[0]);
		t.time(seconds);

	}

}
