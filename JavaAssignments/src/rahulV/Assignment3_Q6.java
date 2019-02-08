package rahulV;

import java.util.Scanner;

public class Assignment3_Q6 {

	void printGrade(int marks) {      
		if (marks < 50 && marks >= 0) {

			System.out.println("Student is failed");
		} else if (marks < 75 && marks >= 50) {

			System.out.println("First class");
		} else if (marks < 100 && marks >= 75) {

			System.out.println("Distinction");
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the marks: ");
		int marks = scanner.nextInt();

		Assignment3_Q6 result = new Assignment3_Q6();
		result.printGrade(marks);
	}

}
