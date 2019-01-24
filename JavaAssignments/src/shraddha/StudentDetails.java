//-----------------------------------------------------------------------------------
//Assignment: Display name, roll no and marks of the student provided by the user.
//-----------------------------------------------------------------------------------

package shraddha;

public class StudentDetails {

	int roll_no, marks;
	String name;

	// STUDENT DETAILS FUNCTION
	void Student_Details(String studentname) {
		if (studentname.equals("Shraddha") || studentname.equals("shraddha")) {
			name = "Shraddha";
			roll_no = 01;
			marks = 60;
		} else if (studentname.equals("Anuj") || studentname.equals("anuj")) {
			name = "Anuj";
			roll_no = 02;
			marks = 90;
		} else if (studentname.equals("Vishal") || studentname.equals("vishal")) {
			name = "Vishal";
			roll_no = 03;
			marks = 70;
		} else {
			name = "Does not exists";
		}

	}

	// DISPLAY NAME ROLL NO AND MARKS OF STUDENT
	void display(String name1) {
		Student_Details(name1);
		System.out.println("Name of Student:= " + name + "\n" + "Roll No:" + roll_no + "\n" + "Marks: " + marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentDetails().display(args[0]);

	}

}
