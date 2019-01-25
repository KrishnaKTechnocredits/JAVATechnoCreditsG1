package vishal;

public class StudentDetails {
	void printData(String name, int rollNo, int marks) {
		System.out.println("Student Name is " + name);
		System.out.println("Student Roll no is " + rollNo);
		System.out.println("Student Marks are " + marks);

	}

	public static void main(String[] args) {
		String stuName = args[0];
		int stuRollNo = Integer.parseInt(args[1]);
		int marks = Integer.parseInt(args[2]);

		StudentDetails sd = new StudentDetails();
		sd.printData(stuName, stuRollNo, marks);
	}

}
