package saket;

public class Secondconversion {

	static int second = 360;
	static int minutes;
	static int hour;

	static void conversion() {

		minutes = second / 60;
		hour = second / 3600;
		System.out.println(minutes);
		System.out.println(hour);
		System.out.println(second);

	}

	public static void main(String[] args) {

		conversion();


	}

}
