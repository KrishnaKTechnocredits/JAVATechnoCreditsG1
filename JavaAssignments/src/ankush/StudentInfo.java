package ankush;

public class StudentInfo {

	static void studentInformation(int rollNo, String name, int mark) {
		System.out.println("Student Information");
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Mark : " + mark);
	}

	public static void main(String[] args) {
		int rollNo = Integer.parseInt(args[0]);
		String name = args[1];
		int mark = Integer.parseInt(args[2]);
		StudentInfo.studentInformation(rollNo, name, mark);
	}
}
