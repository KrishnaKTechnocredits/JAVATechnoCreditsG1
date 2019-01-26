package vishal;

public class SecToHrMinSec {
	public void timeConvert(int sec) {
		int hrConvert = sec / 3600;
		int hrReminder = sec % 3600;

		int minConvert = hrReminder / 60;
		int minReminder = hrReminder % 60;

		int secs = minReminder;

		System.out.println("Converted Time: " + hrConvert + "hr " + minConvert + "min " + secs + "sec");

	}

	public static void main(String[] args) {

		int sec = Integer.parseInt(args[0]);
		SecToHrMinSec s1 = new SecToHrMinSec();
		s1.timeConvert(sec);

	}
}
