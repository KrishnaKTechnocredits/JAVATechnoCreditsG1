//-----------------------------------------------------------------
//Assignment: Write a program to convert seconds to HH:MM:SS format
//------------------------------------------------------------------

package shraddha.assignment_1;

public class TimeCalc {

	String Min_Calc(double seconds) {
		double minutes = 0;
		int inpart = 0;
		String decipart = null;

		minutes = (seconds/60);
		inpart = (int) minutes;
		decipart = String.valueOf(minutes - inpart);
		decipart = decipart.substring(3, 5);
		// decipart = decipart.substring(2);
		decipart = inpart + " Minutes " + decipart + " Seconds";
		return decipart;
	}

	String Hour_calc(double seconds) {
		double hour = 0, hr_decipart = 0;
		int hr_inpart = 0;
		String s = null;

		hour = (seconds / 3600);
		hr_inpart = (int) hour;
		hr_decipart = hour - hr_inpart;

		if (hr_decipart > 0) {
			s = String.valueOf(hr_decipart);
			s = s.substring(3, 6);
			// s = s.substring(3);
			s = Min_Calc(Double.parseDouble(s));
			s = hr_inpart + " Hrs " + s;
		}

		return s;
	}

	void Display(double seconds) {
		System.out.println(seconds + " Seconds:= ");
		// System.out.println("In Minutes:= "+Min_Calc(seconds));
		System.out.println(Hour_calc(seconds));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimeCalc().Display(Double.parseDouble(args[0]));

	}

}
