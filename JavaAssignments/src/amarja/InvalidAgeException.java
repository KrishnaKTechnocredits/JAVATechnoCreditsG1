package amarja;

public class InvalidAgeException extends Exception {

	InvalidAgeException(String s) {
		super(s);
		if (s.equals("1")) {
			System.out.println("You should have come after completing 12 years");
		} else if (s.equals("2")) {
			System.out.println("You should have come before 12 years..");
		}
	}
}
