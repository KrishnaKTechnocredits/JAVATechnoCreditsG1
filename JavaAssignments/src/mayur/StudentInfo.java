package mayur;

public class StudentInfo 
{
	public static void main(String[] args) 
	{
		int rNo = Integer.parseInt(args[0]);
		String sName = args[1];
		float marks = (float) Double.parseDouble(args[2]);//parse string to double
		StudentInfo s = new StudentInfo();
		s.DisplayStudentInfo(rNo, sName, marks);
	}

	void DisplayStudentInfo(int rNo, String sName, float marks)
	{
		System.out.println("Roll No :" + rNo);
		System.out.println("Name :" + sName);
		System.out.println("Marks :" + marks);
	}
}