package vishal;

public class StudentDetails {
	void printName(String name) {
		System.out.println("Student Name is " + name);
	}

	void printRollNo(int rollNo) {
		System.out.println("Student Roll No. is " + rollNo);
	}

	void printMarks(int marks) {
		System.out.println("Student Marks are " + marks);
	}

	public static void main(String[] args) {
		String stuName = args[0];
		int stuRollNo = Integer.parseInt(args[1]);
		int marks = Integer.parseInt(args[2]);

		StudentDetails sd = new StudentDetails();
		sd.printName(stuName);
		sd.printRollNo(stuRollNo);
		sd.printMarks(marks);
	}

}
