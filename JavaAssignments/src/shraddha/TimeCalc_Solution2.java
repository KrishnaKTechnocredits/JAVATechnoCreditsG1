package shraddha;

public class TimeCalc_Solution2 {

	void Time_calc_1(int seconds) {
		int hr = seconds / 3600;
		int remaining_min = seconds % 3600;
		int min = remaining_min / 60;
		int remainingsec = remaining_min % 60;

		System.out.println(seconds + " SECONDS:= " + hr + " hh:" + min + " mm:" + remainingsec + " sec.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TimeCalc_Solution2().Time_calc_1((Integer.parseInt(args[0])));

	}

}
