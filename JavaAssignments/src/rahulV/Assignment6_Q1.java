package rahulV;

public class Assignment6_Q1 {

	int rNo = 50;
	String name = "Rahul";

	void displayDetails() {
		System.out.println("Name is " + name + "Roll no is " + rNo);
	}

	public static void main(String[] args) {
		Assignment6_Q1 obj = new Assignment6_Q1();
		obj = null;

		try {
			System.out.println("In try block");
			obj.displayDetails();
		} catch (NullPointerException e) {
			System.out.println("In catch block");
			e.printStackTrace();
		} finally {
			System.out.println("Program end");
		}
	}
}