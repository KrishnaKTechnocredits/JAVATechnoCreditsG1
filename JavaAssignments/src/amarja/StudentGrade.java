package amarja;
import java.util.Scanner;
//Q6 WAP to input students marks by condition
public class StudentGrade {
	void findgrade(int marks)
	{
		if(marks > 0 && marks<50)
		{
			System.out.print(" Failed");
		}		
		else if (marks >= 50 && marks<75)
		{
			System.out.print(" I st Class");
		}		
		else if (marks >= 75 && marks<=100)
			{
			System.out.print(" Distinction");
		    }	
			}	
	public static void main(String args[])
	{
		System.out.println("Enter marks of students");//Reading input from user
		Scanner sr =new Scanner(System.in);
		int marks=sr.nextInt();
		sr.close();
		StudentGrade srg=new StudentGrade();
		if (marks>100 || marks<0)
			System.out.print(" Error !! Marks cannot be less than 0 and more than 100");
		else
		{System.out.print("Student with marks " + marks+" has");
		srg.findgrade(marks);
		}
		}
	}
