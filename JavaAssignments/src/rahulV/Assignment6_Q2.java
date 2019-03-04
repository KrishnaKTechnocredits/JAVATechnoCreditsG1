package rahulV;

public class Assignment6_Q2 {

	void displayElement() {

		int array[] = { 2, 3, 4, 5, 6 };
		System.out.println(array[5]);
	}

	public static void main(String[] args) {

		Assignment6_Q2 d = new Assignment6_Q2();
		try {
			System.out.println("In try block");
			d.displayElement();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In catch block");
			e.printStackTrace();
		}
		System.out.println("Program end");
	}

}
