package vishal;

public class Exception_Q1 {

	public static void main(String[] args) {

		try {
			Exception_Q1 q1 = null;

			q1.testException();
		} catch (NullPointerException msg) {
			System.out.println(msg.getMessage());
			System.out.println("Null Point Exception occurred: Handled in catch");
			Exception_Q1 q1 = new Exception_Q1();
			q1.testException();

		}

	}

	public void testException() {
		System.out.println("This method is to test exception");
	}

}
