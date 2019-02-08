package vishal;

import java.util.Scanner;

public class StudentMarks {

	public String studentResult(int marks) {
		String Status = "";
		if (marks >= 0 && marks < 50) {
			Status = "Fail";
		} else if (marks >= 50 && marks < 75) {
			Status = "1st Class";
		} else if (marks >= 75 && marks <= 100) {
			Status = "Distinction";
		}
		return Status;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks");
		int marks = sc.nextInt();
		if (marks <= 100) {
			StudentMarks sm = new StudentMarks();
			String result = sm.studentResult(marks);
			System.out.println("Result: " + result);
		} else {
			System.out.println("Invalid Range: Enter Marks between 0 to 100");
		}

	}

}
