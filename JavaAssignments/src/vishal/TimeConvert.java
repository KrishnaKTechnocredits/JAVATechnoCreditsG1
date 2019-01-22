package vishal;

public class TimeConvert {
	public float secToHour(int secs) {
		float hr = (float) secs / 3600;
		return hr;
	}

	public float secToMin(int secs) {
		float min = (float) secs / 60;
		return min;
	}

	public float secToSec(int secs) {
		return (float) secs;
	}

	public static void main(String[] args) {
		TimeConvert tc = new TimeConvert();
		float hr = tc.secToHour(60);
		float min = tc.secToMin(50);
		float sec = tc.secToSec(60);

		System.out.println("Sec to Hour Converted Value " + hr + " Hour");
		System.out.println("Sec to Min Converted Value " + min + " Minute");
		System.out.println("Sec to Sec " + sec + " Secs");

	}
}
