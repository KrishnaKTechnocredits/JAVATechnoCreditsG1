package farhin;

public class TimeConversion {
	public static void main(String[] a) {
		int s=Integer.parseInt(a[0]);
		timeConversion(s);
		
	}

	static void timeConversion(int totalSeconds) {

		int hours = totalSeconds/(60*60);
		int remainingMinutes = totalSeconds%(60*60);
		int minutes = remainingMinutes/60;
		int remainingSeconds = remainingMinutes%60;
		
		System.out.println("Hours: "+hours+", Minutes: "+minutes+", Seconds: "+remainingSeconds);
		
		
		
	}

}
