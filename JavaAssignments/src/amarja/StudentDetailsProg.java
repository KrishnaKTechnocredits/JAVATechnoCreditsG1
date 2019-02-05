package amarja;
//Program to Print Student Details by taking Roll no , Names and Marks)
public class StudentDetailsProg {
	public static void main(String[] args) {
		StudentDetailsProg a= new StudentDetailsProg();
		a.studentDetails(Integer.parseInt(args[0]),args[1],Integer.parseInt(args[2]));
		}
	void studentDetails(int rollnum, String name,int marks){
		System.out.println("***Student Details***");
		System.out.println("Roll Number = " + rollnum );
		System.out.println("Name = " + name );
		System.out.println("Marks = " + marks );
	}
	}
