package amarja;

/*Define an object reference and initialize it to null. Try to call a method through this reference.
Now wrap the code in a try-catch clause to catch the exception.
 */
public class Exception1 {

	public static void main(String args[]) {
		Student s1 = new Student();
		s1 = null;
		try {
			s1.studentdetails();
		} catch (Exception e) {
			System.out.println("Error !!! Object initialized to null");
			e.printStackTrace();
		}

		System.out.println("Program End");

	}

}
