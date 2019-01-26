package saket;

public class Secondconversion {

	int second;
	int minutes;
	int hour;

	void conversion(int a) {

		minutes = a / 60;// converts seconds to minutes
		hour = a / 3600;// convert seconds to hour
		second = (a % 60);// gives the remaining seconds after getting hour and
							// minute
		System.out.println(hour + "hours" + minutes + "minutes" + second + "seconds");
	}

	public static void main(String[] args) {

		Secondconversion A = new Secondconversion();

		A.conversion(150);
	}

}
