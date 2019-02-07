// Print student's passing class

package mayur;

import java.util.Scanner;

public class StudentMarks 
{
	void displayResult(int marks) 
	{
		if (marks > 0 && marks <= 50)
			System.out.println("Student is FAIlDED");
		else if (marks > 50 && marks <= 75)
			System.out.println("Student passed with 1st Class");
		else if (marks > 75 && marks < 100)
			System.out.println("Student passed with Distinction ");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StudentMarks studentMarks = new StudentMarks();
		System.out.println("Enter student's Marks :");
		int marks = sc.nextInt();
		if (marks < 0 || marks > 100)
			System.out.println("Marks can not be in negative(less than 0) OR more than 100 ");
		else
			studentMarks.displayResult(marks);
		sc.close();
	}
}
