package rahulV;

public class Assignment6_Q6 {

	static void validateAge(int age) {
		if (age < 12) {
			System.out.println("You should have come after " + (12 - age) + " years");
			throw new ArithmeticException("Age Exception");
		} else if (age > 12 && age < 60) {
			System.out.println("You are allowed for the ride");
		} else if (age > 60) {

			System.out.println("You should have come before " + (age - 60) + " years");
		}

	}

	public static void main(String[] args) {
		validateAge(80);
		System.out.println("End program");
	}
}