package rahulV;

public class Student {

	void display(String name, int rNo, int marks) {
		System.out.println("Name: " + name + "  Roll no:" + rNo + " and Marks: " + marks);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		String name = args[0];
		int rollNo = Integer.parseInt(args[1]);
		int marks = Integer.parseInt(args[2]);
		// s1.display("Rahul",1,100);
		s1.display(name, rollNo, marks);

	}

}
